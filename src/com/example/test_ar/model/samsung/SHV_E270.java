package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S3 그랜드
public class SHV_E270 extends AModelMap
{
	public SHV_E270()
	{
		super("SHV-E270");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 400));
		list.add(new Map2DItem(175, 410));
		list.add(new Map2DItem(170, 420));
		list.add(new Map2DItem(165, 452));
		list.add(new Map2DItem(160, 473));
		list.add(new Map2DItem(155, 517));
		list.add(new Map2DItem(150, 552));
		list.add(new Map2DItem(145, 574));
		list.add(new Map2DItem(140, 652));
		list.add(new Map2DItem(135, 692));
		list.add(new Map2DItem(130, 732));
		list.add(new Map2DItem(125, 801));
		list.add(new Map2DItem(120, 786));
		list.add(new Map2DItem(115, 936));
		list.add(new Map2DItem(110, 1008));
		list.add(new Map2DItem(105, 1156));
		list.add(new Map2DItem(100, 1296));
		list.add(new Map2DItem(95, 1444));
		list.add(new Map2DItem(90, 1602));
		list.add(new Map2DItem(85, 1827));
		list.add(new Map2DItem(80, 2047));
		list.add(new Map2DItem(75, 2379));
		list.add(new Map2DItem(70, 2730));
		list.add(new Map2DItem(65, 3248));
		list.add(new Map2DItem(60, 3846));
		list.add(new Map2DItem(55, 4525));
		list.add(new Map2DItem(50, 5595));
		list.add(new Map2DItem(45, 6919));
		list.add(new Map2DItem(40, 9060));
		list.add(new Map2DItem(35, 11828));
		list.add(new Map2DItem(30, 16147));
		list.add(new Map2DItem(25, 23978));
		list.add(new Map2DItem(20, 34077));
		
		initMinAndMax();
	}
}
