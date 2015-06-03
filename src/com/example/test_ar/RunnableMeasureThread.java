package com.example.test_ar;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import potencia.sam.lib.AreaUtil;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;

public class RunnableMeasureThread implements Runnable 
{
	private final int TIME_UNIT = 100;
	
	private Handler m_handler;
	
	private boolean m_running = false;
	//private double m
	
	private Lock m_mutex = new ReentrantLock(true);
	private boolean m_capture = false;
	private ArrayList<Point> m_capturePoint = null;
	private int m_distance = 0;
	
	
	public void setCapture(int distance, ArrayList<Point> points, boolean capture) 
	{
		m_mutex.lock();
		m_distance = distance;
		m_capturePoint = points;
		m_capture =  capture;
		m_mutex.unlock();
	}
	
	public RunnableMeasureThread(Handler handler)
	{
		m_handler = handler;
	}
	
	public boolean IsRunning()
	{
		return m_running;
	}
	
	public void Stop()
	{
		m_running = false;
	}
	
	@Override
	public void run() 
	{
		m_running = true;
		
		while (m_running)
		{
			if (m_capture && m_capturePoint != null)
			{
				m_mutex.lock();
				double area = ComputeArea(m_capturePoint.get(0), m_capturePoint.get(1), m_capturePoint.get(2), m_capturePoint.get(3));
				int arc = getAngle(m_capturePoint.get(0).x, m_capturePoint.get(0).y, m_capturePoint.get(1).x, m_capturePoint.get(0).y);				
				
				Util.Log("#### m_capturePoint.get(0) : "+ m_capturePoint.get(0)+"RunableMeasure Area : "+area);
				
				Message msg = Message.obtain();
				msg.what = 2;
				msg.arg1 = m_distance;
				msg.arg2 = arc;
				msg.obj = (double)area;
				
				
				m_handler.sendMessage(msg);
				
				m_distance = 0;
				m_capture = false;
				m_capturePoint = null;
				
				m_mutex.unlock();
			}
			
			try { Thread.sleep(TIME_UNIT); } catch (Exception e) {}
			
		} // end while
		
	} // end run
	
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
	
}
