package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 어드밴스 코어
public class SHW_M570 extends AModelMap
{
	public SHW_M570()
	{
		super("SHW-M570");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 518));
		
		
		initMinAndMax();
	}
}
