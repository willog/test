package com.example.test_ar;

public class Map2DItem 
{
	private int m_distance = 0;
	private int m_stdArea = 0;
	
	private int m_minArea = 0;
	private int m_maxArea = 0;
	
	public Map2DItem(int distance, int area)
	{
		m_distance =distance;
		m_stdArea = area;
	}
	
	public void setMinAndMax(int min, int max)
	{
		m_minArea = (m_stdArea + min) / 2 + 1;
		m_maxArea = (m_stdArea + max) / 2;
	}
	
	public int getDistance() { return m_distance; }
	public int getMinArea() { return m_minArea; }
	public int getMaxArea() { return m_maxArea; }
	public int getStdArea() { return m_stdArea; }
}
