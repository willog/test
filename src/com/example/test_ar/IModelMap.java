package com.example.test_ar;

import java.util.ArrayList;

public interface IModelMap 
{
	String getModel();
	ArrayList<Map2DItem> getList();
	
	void initMinAndMax();
	Map2DItem find2DItem(int area);
}
