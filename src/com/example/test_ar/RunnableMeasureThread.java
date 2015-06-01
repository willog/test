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
				double area = AreaUtil.ComputeArea(m_capturePoint.get(0), m_capturePoint.get(1), m_capturePoint.get(2), m_capturePoint.get(3));
				
				Message msg = Message.obtain();
				msg.what = 2;
				msg.arg1 = m_distance;
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
	
}
