package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S3 3G
public class SHW_M440 extends AModelMap
{
	public SHW_M440()
	{
		super("SHW-M440");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 451));
		
		initMinAndMax();
	}
}
