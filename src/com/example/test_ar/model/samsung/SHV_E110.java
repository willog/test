package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S2 LTE
public class SHV_E110 extends AModelMap
{
	public SHV_E110()
	{
		super("SHV-E110");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		
		initMinAndMax();
	}
}
