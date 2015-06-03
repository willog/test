package com.example.test_ar;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import com.example.test_ar.Util;

import potencia.sam.lib.AreaUtil;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class RunnableComputeThread implements Runnable 
{
	private final int TIME_UNIT = 100;
	private final int READ_PERIOD = TIME_UNIT * 3;
	
	private SensorManager m_sm;
	private Sensor m_accSensor;
	private Sensor m_geoSensor;
	
	private Handler m_handler;
	
	private boolean m_running = false;
	private LinkedBlockingQueue<ArrayList<Point>> m_queue = new LinkedBlockingQueue<ArrayList<Point>>(); 

	private double m_angleA = 0L;
	private double m_angleB = 0L;
	
	private float[] m_gravity = new float[3];
	private float[] m_magnetic = new float[3];
	
	private String m_resultMsg = "";
	
	private boolean m_play = false;
	private double m_measuredDistance = 0.0;
	
	public String getResultMsg() { return m_resultMsg; }
	public void setPlay(boolean value) { m_play = value; }
	public boolean getPlay() { return m_play; }
	
	public double getMeasuredDistance() { return m_measuredDistance; }
	
	private int orl_value = 2;
	private double distance_fl;
	private int onemore = 0;
	
	
	public RunnableComputeThread(SensorManager sm, Handler handler)
	{
		m_handler = handler;
		m_sm = sm;
		m_accSensor = m_sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		m_geoSensor = m_sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
	}
	
	public boolean IsRunning()
	{
		return m_running;
	}
	
	public void Stop()
	{
		m_sm.unregisterListener(m_sensorEventListener);
		m_running = false;
	}
	
	public void PushBack(ArrayList<Point> item)
	{
		m_queue.add(item);
	}
	
	public ArrayList<Point> PopFront() throws Exception
	{
		return m_queue.take();
	}
	
	private float[] getOrientation(float[] gravity, float[] geomagnetic)
	{		
		float[] R = new float[9];
		float[] values = new float[3];
		
		SensorManager.getRotationMatrix(R, null, gravity, geomagnetic);
		SensorManager.getOrientation(R, values);
		
		return values;
	}
	
	@Override
	public void run() 
	{
		m_sm.registerListener(m_sensorEventListener, m_accSensor, SensorManager.SENSOR_DELAY_NORMAL);
		m_sm.registerListener(m_sensorEventListener, m_geoSensor, SensorManager.SENSOR_DELAY_NORMAL);
		
		m_running = true;
		
		ArrayList<Double> values = new ArrayList<Double>();
		final int timelimit = (TIME_UNIT * 10) * 2;
		int timesum = 0;
		
		int sum = 0;
		while (m_running)
		{
			if (sum > READ_PERIOD)
			{
				sum = 0;
				
				try
				{
					ArrayList<Point> points = PopFront();
					
					if (points.size() < 4)
					{
						try { Thread.sleep(10); } catch (Exception e) {}
						continue;
					}
										
					if (m_angleB >=orl_value && m_angleB <=-orl_value && m_angleA >=orl_value && m_angleA <= -orl_value)
					{
						try { Thread.sleep(10); } catch (Exception e) {}
						continue;
					}
					

					double area = ComputeArea(points.get(0), points.get(1), points.get(2), points.get(3));
					Map2DItem item = MainActivity.m_map.find2DItem(area);
					if (item == null)
					{
						try { Thread.sleep(10); } catch (Exception e) {}
						continue;
					}
					
					//double distance = (double)(((Math.pow(item.getStdArea(),10)*10000000) * item.getDistance()) / (Math.pow(area,10)*10000000));

					double distance = (double)(Math.sqrt(item.getStdArea()) * item.getDistance()) / Math.sqrt(area);										
					
					distance_fl = (double)(item.getStdArea() * item.getDistance()) / area;

					int arc = getAngle(points.get(0).x, points.get(0).y, points.get(1).x, points.get(1).y);
					
					Util.Log("1111 입력한 면적 크기 : "+Math.sqrt(item.getStdArea())+" 입력한 길이  : "+item.getDistance()+" 실제 면접 값 : "+ Math.sqrt(area)+"A 각도 : " + arc);
					
					
					//double distance = (double)((Math.sqrt(MainActivity.STD_AREA) * 100) / Math.sqrt(area));
					
					if (m_play)
					{
						values.add(distance);
					}
					
//					double pol = Math.sqrt(Math.pow(distance, 2) + t);
//					distance = pol;
					
					//String log = "ax : " + String.valueOf(m_angleA) + ", ay : " + String.valueOf(m_angleB)  + ", area : " + String.valueOf(area) + ", distance : " + String.valueOf(distance);
					String log = "area : " + String.valueOf(area) + ", distance : " + String.valueOf(distance);
					Log.d("test", log);
					//Log.d("test", log + ", s : " + String.valueOf(s));
					//Log.d("test", log + ", [" + String.valueOf(cp.x) + ", " + String.valueOf(cp.y) + "]");
					
					m_resultMsg = log;
				}
				catch (Exception e) {}
				finally
				{
					m_queue.clear();
				}
			}
			
			try { Thread.sleep(TIME_UNIT); } catch (Exception e) {}
			sum += TIME_UNIT;
			
			if (m_play)
			{
				timesum += TIME_UNIT;
				if (timesum > timelimit)
				{
					m_play = false;
					
					m_measuredDistance = 0;
					if (values.size() > 0 )
					{
						for (Double d : values)
						{
							m_measuredDistance += d;
							onemore ++;
						}
						m_measuredDistance /= values.size();
						
						for (Double a : values)
						{
							m_measuredDistance += a;
						}
						m_measuredDistance /= onemore;
					}
					
					m_running = false;
					
					Message msg = Message.obtain();
					msg.what = 1;
					msg.obj = (Double)m_measuredDistance;
					
					m_handler.sendMessage(msg);
					
				} // end if
			}
			
		} // end while
		
		m_sm.unregisterListener(m_sensorEventListener, m_accSensor);
		m_sm.unregisterListener(m_sensorEventListener, m_geoSensor);
				
	} // end run
	
	private SensorEventListener m_sensorEventListener = new SensorEventListener() 
	{
		@Override
		public void onSensorChanged(SensorEvent event) 
		{
			if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER)
			{
				m_gravity = event.values;
				m_angleA = Math.round(Math.toDegrees((double)getOrientation(m_gravity, m_magnetic)[2]));
				m_angleB = Math.round(Math.toDegrees((double)getOrientation(m_gravity, m_magnetic)[1]));
			}
			else if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD)
			{
				m_magnetic = event.values;
				m_angleA = Math.round(Math.toDegrees((double)getOrientation(m_gravity, m_magnetic)[2]));
				m_angleB = Math.round(Math.toDegrees((double)getOrientation(m_gravity, m_magnetic)[1]));
			}
		}
		
		@Override
		public void onAccuracyChanged(Sensor sensor, int accuracy) 
		{
		}
		
	};

	private double ComputeArea(Point pt1, Point pt2, Point pt3, Point pt4)
	{
	    double line1 = getLine(pt1, pt2);
	    double line2 = getLine(pt2, pt3);
	    double line3 = getLine(pt3, pt4);
	    double line4 = getLine(pt4, pt1);
	    double averageLine = (line1+line2+line3+line4)/4.0;
	    return averageLine * averageLine;
	}
	
	private double getLine(Point pt1, Point pt2)
	{
		int dx = pt1.x - pt2.x;
		int dy = pt1.y - pt2.y;
		return Math.sqrt(dx*dx+dy*dy);
	}	
	private int getAngle(int x1,int y1, int x2,int y2){
		int dx = x2 - x1;
		int dy = y2 - y1;
	   
	   double rad= Math.atan2(dx, dy);
	   double degree = (rad*180)/Math.PI ;
	 
	   return (int)degree;
	  }
	
	public int ArcCalc(double lx1, double ly1, double lx2, double ly2)// 각도 계산하기 입력된 직선의 xy값 2개
	{
	    double inner = (lx1*lx2 + ly1*ly2);// 기본내적
	  
	    double i1=Math.sqrt(lx1*lx1+ ly1*ly1); // 처음 직선의 노말라이즈 준비
	    double i2=Math.sqrt(lx2*lx2+ ly2*ly2); // 두번째 직선의 노말라이즈 준비
	 
	    lx1=(lx1/i1); // 각 요소를 단위 벡터로 변환한다.
	    ly1=(ly1/i1);
	    lx2=(lx2/i2);
	    ly2=(ly2/i2);
	 
	    //위 과정을 거치면 결과적으로 계산된 두 직선의 크기는 1이면서 방향은 이전과 같은 단위벡터가 된다.
	    inner =(lx1*lx2 + ly1*ly2); //다시 내적을 구한다.
	    int result = (int) (Math.acos(inner)*180/Math.PI);
	    // 아크 코사인을 통해 라디안을 구하고 그걸 각도로 변환하기 위해 180을 곱하고 파이로나눈다.
	    if(lx1 > lx2) result=360-result;//?? 이게 아닌거 같다.
	    // 사이각은 최대 0-180도 사이마 존재함으로 입력된 x값을 참조하여 360에 가까운 값으로 변환하는 과정을 거친다.
	    
	    Util.Log("#### 각도 : "+ result);
	    return result ; //완료
	}
	
	
}
