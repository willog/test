package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시노트1
public class SHV_E160 extends AModelMap
{
	public SHV_E160()
	{
		super("SHV-E160");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 554));
		
		initMinAndMax();
	}
}
