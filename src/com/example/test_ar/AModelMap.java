package com.example.test_ar;

import java.util.ArrayList;

public abstract class AModelMap implements IModelMap 
{
	private String m_model = "";
	private ArrayList<Map2DItem> m_list = new ArrayList<Map2DItem>();
	
	@Override
	public String getModel() { return m_model; };
	
	@Override
	public ArrayList<Map2DItem> getList() 
	{
		return m_list;
	}
	
	public AModelMap(String model)
	{
		m_model = model;
	}
	
	@Override
	public void initMinAndMax() 
	{
		int min = 1;
		int max = Integer.MAX_VALUE;
		for (int i=0; i<m_list.size() - 1; ++i)
		{
			m_list.get(i).setMinAndMax(min, m_list.get(i+1).getStdArea());
			min = m_list.get(i).getStdArea();
		}
		m_list.get(m_list.size() - 1).setMinAndMax(min, max);
	}
	
	@Override
	public Map2DItem find2DItem(int area)
	{
		for (Map2DItem item : m_list)
		{
			if (item.getMaxArea() > area)
			{
				return item;
			}
		}
		
		return m_list.get(m_list.size() - 1);
	}
}
