package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시노트3 네오
public class SM_N750 extends AModelMap
{
	public SM_N750()
	{
		super("SM-N750");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		
		initMinAndMax();
	}
}
