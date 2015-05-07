package com.example.test_ar.model.pantech;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 베가
public class IM_A870 extends AModelMap
{
	public IM_A870()
	{
		super("IM-A870");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 399));

		initMinAndMax();
	}
}
