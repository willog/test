package com.example.test_ar.model.pantech;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 베가 No.6
public class IM_A860 extends AModelMap
{
	public IM_A860()
	{
		super("IM-A860");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 399));

		initMinAndMax();
	}
}
