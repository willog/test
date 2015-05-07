package com.example.test_ar;


import java.util.ArrayList;

import javax.microedition.khronos.opengles.GL10;

import com.example.test_ar.MeasureView;

import jp.androidgroup.nyartoolkit.markersystem.NyARAndMarkerSystem;
import jp.androidgroup.nyartoolkit.markersystem.NyARAndSensor;
import jp.androidgroup.nyartoolkit.sketch.AndSketch;
import jp.androidgroup.nyartoolkit.utils.camera.CameraPreview;
import jp.androidgroup.nyartoolkit.utils.gl.AndGLBox;
import jp.androidgroup.nyartoolkit.utils.gl.AndGLDebugDump;
import jp.androidgroup.nyartoolkit.utils.gl.AndGLFpsLabel;
import jp.androidgroup.nyartoolkit.utils.gl.AndGLTextLabel;
import jp.androidgroup.nyartoolkit.utils.gl.AndGLView;
import jp.nyatla.nyartoolkit.core.types.NyARIntPoint2d;
import jp.nyatla.nyartoolkit.markersystem.NyARMarkerSystemConfig;
import android.app.AlertDialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;

import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Hiroマーカの上にカラーキューブを表示します。
 * 定番のサンプルです。
 *
 */


public class SimpleLiteActivity extends AndSketch implements AndGLView.IGLFunctionEvent, SensorEventListener
{
	public class Draw extends SurfaceView{
		private Paint paint;
		
		public Draw(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		protected void onDraw(Canvas canvas){
			 canvas.drawColor(Color.BLUE);
		        paint = new Paint();
		        paint.setARGB(255,0,0,255);
		        paint.setTextSize(32);

		        int x = 100;
		        int y = 100;
		        int size = 100;
		        canvas.drawCircle(x,y,size,paint);			
		}
		
	}	
	
	private final int STATUS_HEADING = 0;
	private final int STATUS_READY = 1;
	private final int STATUS_MEASURE = 2;
	private final int STATUS_FIXED = 3;
	private final int STATUS_FIXING = 4;
	private final int STATUS_ROTATION_FIXING = 5;	
	
	private final int MSG_REFRESH_HEIGHT = 1;
	private final int MSG_NOT_MATCH = 2;
	private final int MSG_HEADING = 3;
	private final int MSG_READY = 4;
	private final int MSG_FIXED = 5;
	private final int MSG_FIXING = 6;
	private final int MSG_ROTATION_FIXING = 7;	
	
	public static final int MSG_MEASURE_COMPLETE = 201;
	
	private ImageView mImvMeasurePopText;	
	
	
	private SensorManager sm;	
	
	private Snippet sLine;
	private Context mContext;	
	private Draw draw;
	
	private Camera.Size mCameraSize;	
	
	CameraPreview _camera_preview;
	AndGLView _glv;
	Camera.Size _cap_size;
	
	private NyARAndMarkerSystem mMarkerSystem;	
	
	private RunnableComputeThread m_runnableComputeThread = null;
	private RunnableMeasureThread m_runnableMeasureThread = null;
	
	private int m_captureDistance = 0;
	private boolean m_capture = false;
	
	private MeasureView mMeasureView;	

	private Sensor lightSensor;
	private Sensor oriSensor;
	
	private int m_check_count = 0;
	
	private int cameraLux = 0;
	private float m_orl_dataxy = 0;
	private float m_orl_datax2y2 = 0;	
	private float m_lux_data = 0;
	
	private int mMsgInMeasuring;	
	private boolean mIsTickering;	
	private int mTickerCount;
	private int mStatus;
	
	private double mDistance;	
	
	private boolean mIsAddedMeasurePopText;
	
	private FrameLayout fr;

	private TextView mTvxMeasureLoading;	
	
	@Override
	public void onStart()
	{
		super.onStart();
		
		
		mStatus = STATUS_HEADING;
		
		mContext = getApplicationContext();
		
		Log.d("test", "test_ar, onStart");
		
		MainActivity.m_measureList.clear();
		
		int width = 640;
		int height = 480;

		
		fr = ((FrameLayout)this.findViewById(R.id.sketchLayout));
		
		FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
		layoutParams.gravity = Gravity.CENTER_VERTICAL;
		layoutParams.setMargins(0, 0, 0, 0);

		this._camera_preview=new CameraPreview(this);
		this._cap_size=this._camera_preview.getRecommendPreviewSize(width, height);
		
		draw = new Draw(this);
		draw.setZOrderOnTop(true);
		
		mMeasureView = new MeasureView(mContext);
		_cap_size = _camera_preview.getRecommendPreviewSize(width, height);
		
		Point displaySize = new Point();
		getWindowManager().getDefaultDisplay().getSize(displaySize);
		
		
//		this._camera_preview.setLayoutParams(layoutParams);
		
//		fr.addView(this._camera_preview, 0, layoutParams);
		
		int h = this.getWindowManager().getDefaultDisplay().getHeight();
		int screen_w , screen_h;
		screen_w= _cap_size.width * h/_cap_size.height ;
		screen_h=h;
		
		
		int w = this.getWindowManager().getDefaultDisplay().getWidth();
		int targetX = (w * 300) / 1280;
		int arrangedCenterPosX = (screen_h * 320) / 480;
		this._camera_preview.setX (targetX-arrangedCenterPosX);
		
		fr.addView(this._camera_preview, 0, new LayoutParams(screen_w, screen_h));
		
		
		this._glv=new AndGLView(this);
		this._glv.setX (targetX-arrangedCenterPosX);
		fr.addView(this._glv, 0,  new LayoutParams(screen_w, screen_h));
		fr.addView(mMeasureView);	
		
		Display display = ((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
		DisplayMetrics displayMetrics = new DisplayMetrics();
		display.getMetrics(displayMetrics);
		
		// Start Sensor Thread
		sm = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
		lightSensor = sm.getDefaultSensor(Sensor.TYPE_LIGHT);
		oriSensor = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);	
		
		m_runnableComputeThread = new RunnableComputeThread(sm, m_handler);
		Thread t = new Thread(m_runnableComputeThread);
		t.setDaemon(true);
		t.start();
		
		// Start Measure Thread
		m_runnableMeasureThread = new RunnableMeasureThread(m_handler);
		Thread t2 = new Thread(m_runnableMeasureThread);
		t2.setDaemon(true);
		t2.start();
		
		mTickerCount = 0;
		
		
		
		MarginLayoutParams numberMarginParams = new MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT);
		numberMarginParams.setMargins(300, 500, 0, 0);
		
		mTvxMeasureLoading = new TextView(mContext);
		mTvxMeasureLoading.setTextColor(Color.WHITE);
		mTvxMeasureLoading.setTextSize(18);
		mTvxMeasureLoading.setLayoutParams(new FrameLayout.LayoutParams(numberMarginParams));
		mTvxMeasureLoading.setText("키재기 스티커를 찾는 중 ...");
		fr.addView(mTvxMeasureLoading);
		
		
		this._camera_preview.setOnClickListener(new View.OnClickListener() 
		{	
			@Override
			public void onClick(View v) 
			{
				final EditText edt = new EditText(SimpleLiteActivity.this);
				edt.setInputType(InputType.TYPE_CLASS_NUMBER);
				
				AlertDialog.Builder alert = new AlertDialog.Builder(SimpleLiteActivity.this);
				alert.setTitle("알림");
				alert.setMessage("거리를 입력하세요.");
				alert.setView(edt);
				alert.setPositiveButton("측정", new DialogInterface.OnClickListener() 
				{
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						m_captureDistance = Integer.parseInt(edt.getText().toString());
						m_capture = true;
						
						dialog.dismiss();
					}
				});
				alert.setNegativeButton("취소", new DialogInterface.OnClickListener() 
				{
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						dialog.dismiss();
					}
				});
				alert.show();
			}
		});
		
		mContext = getApplicationContext();		
	}
	
	@Override
	protected void onStop() 
	{
		m_runnableMeasureThread.Stop();
		m_runnableComputeThread.Stop();
		
		try { _camera_preview.onAcStop(); } 
		catch (Exception e) {}
		
		super.onStop();
	}
	
	@Override
	protected void onDestroy() 
	{
		m_runnableMeasureThread.Stop();
		m_runnableComputeThread.Stop();
		
		try { _camera_preview.onAcDestroy(); }
		catch (Exception e) {}
		
		super.onDestroy();
	};
	
	@Override
	protected void onPause() 
	{
		_camera_preview.onAcPause();
		super.onPause();
		
		Log.d("test", "test_ar, onPause");
	};
	
	@Override
	protected void onResume() 
	{
		super.onResume();
		_camera_preview.onAcResume();
		
        sm.registerListener(this, lightSensor, SensorManager.SENSOR_DELAY_UI );	
        sm.registerListener(this, oriSensor, SensorManager.SENSOR_DELAY_UI );
		
	};

	NyARAndSensor mSensor;
	private int _mid;
	AndGLTextLabel text;
	AndGLBox box;
	AndGLFpsLabel fps;
	
	
	public void onSensorChanged(SensorEvent event){ //http://ehdrn.tistory.com/338 참고할것
		  // 정확도가 낮은 측정값인 경우
      if (event.accuracy == SensorManager.SENSOR_STATUS_UNRELIABLE) {
      }
      // 센서값을 측정한 센서의 종류가 조도 센서인 경우
      if(event.sensor.getType()== Sensor.TYPE_ORIENTATION){
          try {
          			m_orl_dataxy = event.values[2];
          			m_orl_datax2y2 = event.values[1];
          			
					if(m_orl_dataxy<=2 && m_orl_dataxy>=-2 && m_orl_datax2y2<=2 && m_orl_datax2y2>=-2){
					mTvxMeasureLoading.setText("기울기 정상");							
					}else{
					mTvxMeasureLoading.setText("기울어졌습니다.");
					}
					
					fr.invalidate();
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      	
      }
      if(event.sensor.getType() == Sensor.TYPE_LIGHT) {
          m_check_count++;
          float eValue = 0;
          try {
          			m_lux_data = event.values[0];
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
	}
	
	public void setupGL(GL10 gl)
	{
		try
		{
			AssetManager assetMng = getResources().getAssets();
			//create sensor controller.
			this.mSensor=new NyARAndSensor(this._camera_preview,this._cap_size.width,this._cap_size.height,30);
			//create marker system
			this.mMarkerSystem=new NyARAndMarkerSystem(new NyARMarkerSystemConfig(this._cap_size.width,this._cap_size.height));
			//this._mid=this.mMarkerSystem.addARMarker(assetMng.open("AR/data/hiro.pat"),16,25,80);
			this._mid=this.mMarkerSystem.addARMarker(assetMng.open("AR/data/marker_color_16.pat"),16,25,80);
			this.mSensor.start();
			//setup openGL Camera Frustum
			gl.glMatrixMode(GL10.GL_PROJECTION);
			gl.glLoadMatrixf(this.mMarkerSystem.getGlProjectionMatrix(),0);
			this.text=new AndGLTextLabel(this._glv);
			
			this.box=new AndGLBox(this._glv,80);
			this._debug=new AndGLDebugDump(this._glv);
			this.fps=new AndGLFpsLabel(this._glv,"MarkerPlaneActivity");
			this.fps.prefix=this._cap_size.width+"x"+this._cap_size.height+":";
			
			Log.d("test", "Cap Width : " + String.valueOf(this._cap_size.width) + " / Cap Height : " + String.valueOf(this._cap_size.height));
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			this.finish();
		}
	}
	AndGLDebugDump _debug=null;
	
	private void calc2(GL10 gl) throws Exception
	{
		NyARIntPoint2d[] points = this.mMarkerSystem.getMarkerVertex2D(_mid);

		ArrayList<Point> item = new ArrayList<Point>();
		item.add(new Point(points[0].x, points[0].y));
		item.add(new Point(points[1].x, points[1].y));
		item.add(new Point(points[2].x, points[2].y));
		item.add(new Point(points[3].x, points[3].y));
		
		if (m_capture && m_captureDistance > 0)
		{
			m_runnableMeasureThread.setCapture(m_captureDistance, item, true);
			
			m_capture = false;
			m_captureDistance = 0;
		}
		
		m_runnableComputeThread.PushBack(item);
		
		this.text.draw(m_runnableComputeThread.getResultMsg(), 0, 16);
		
		gl.glMatrixMode(GL10.GL_MODELVIEW);
		gl.glLoadMatrixf(this.mMarkerSystem.getGlMarkerMatrix(this._mid),0);
		this.box.draw(0,0,10);
		
	}
	
	/**
	 * 継承したクラスで表示したいものを実装してください
	 * @param gl
	 */
	public void drawGL(GL10 gl)
	{
		try{
			//背景塗り潰し色の指定
			gl.glClearColor(0,0,0,0);
	        //背景塗り潰し
	        gl.glClear(GL10.GL_COLOR_BUFFER_BIT|GL10.GL_DEPTH_BUFFER_BIT);
	        if(ex!=null){
	        	_debug.draw(ex);
	        	return;
	        }
	        
	        fps.draw(0, 0);
			synchronized(mSensor){
				
//					this.mMarkerSystem.update(mSensor);
//					if(this.mMarkerSystem.isExistMarker(this._mid))
//					{
//						calc2(gl);
//					}
					mMarkerSystem.update(mSensor);
					if(mMarkerSystem.isExistMarker(_mid)) 
					{
						calc2(gl);							
					}
			}

		}catch(Exception e)
		{
			ex=e;
		}
	}
	
	Exception ex=null;
	
	private void addMeasuredValue(final int distance, final int area)
	{
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setTitle("결과");
		alert.setMessage("Distance : " + String.valueOf(distance) + ", Area : " + String.valueOf(area));
		
		alert.setPositiveButton("저장", new DialogInterface.OnClickListener() 
		{
			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				MainActivity.m_measureList.add(new Map2DItem(distance, area));
				dialog.dismiss();
			}
		});
		alert.setNegativeButton("취소", new DialogInterface.OnClickListener() 
		{
			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				dialog.dismiss();
			}
		});
		alert.show();
	}

	
	
	private Handler m_handler = new Handler()
	{
		@Override
		public void handleMessage(android.os.Message msg) 
		{
			switch (msg.what)
			{
			case 1:
				new AlertDialog.Builder(SimpleLiteActivity.this)
					.setTitle("결과")
					.setMessage("Distance : " + String.valueOf(msg.arg1))
					.setPositiveButton("닫기", new DialogInterface.OnClickListener() 
					{
						@Override
						public void onClick(DialogInterface dialog, int which) 
						{
							dialog.dismiss();
							finish();
						}
					})
					.show();
				
				break;
			case 2:
				addMeasuredValue(msg.arg1, msg.arg2);
				break;
				
			}
		};
	};

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
}
