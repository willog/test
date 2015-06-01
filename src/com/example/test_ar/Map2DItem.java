package com.example.test_ar;

public class Map2DItem 
{
	private int m_distance = 0;
	private double m_stdArea = 0.0;
	
	private double m_minArea = 0;
	private double m_maxArea = 0;
	
	public Map2DItem(int distance, double area)
	{
		m_distance = distance;
		m_stdArea = area;
	}
	
	public void setMinAndMax(double min, double max)
	{
		m_minArea = (m_stdArea + min) / 2.0 + 1.0;
		m_maxArea = (m_stdArea + max) / 2.0;
	}
	
	public int getDistance() { return m_distance; }
	public double getMinArea() { return m_minArea; }
	public double getMaxArea() { return m_maxArea; }
	public double getStdArea() { return m_stdArea; }
}
