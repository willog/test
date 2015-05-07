package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시노트3
public class SM_N900 extends AModelMap
{
	public SM_N900()
	{
		super("SM-N900");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 462));
		list.add(new Map2DItem(175, 495));
		list.add(new Map2DItem(170, 517));
		list.add(new Map2DItem(165, 563));
		list.add(new Map2DItem(160, 588));
		list.add(new Map2DItem(155, 624));
		list.add(new Map2DItem(150, 689));
		list.add(new Map2DItem(145, 728));
		list.add(new Map2DItem(140, 770));
		list.add(new Map2DItem(135, 842));
		list.add(new Map2DItem(130, 912));
		list.add(new Map2DItem(125, 959));
		list.add(new Map2DItem(120, 1064));
		list.add(new Map2DItem(115, 1160));
		list.add(new Map2DItem(110, 1212));
		list.add(new Map2DItem(105, 1334));
		list.add(new Map2DItem(100, 1487));
		list.add(new Map2DItem(95, 1682));
		list.add(new Map2DItem(90, 1852));
		list.add(new Map2DItem(85, 2117));
		list.add(new Map2DItem(80, 2403));
		list.add(new Map2DItem(75, 2793));
		list.add(new Map2DItem(70, 3144));
		list.add(new Map2DItem(65, 3635));
		list.add(new Map2DItem(60, 4399));
		list.add(new Map2DItem(55, 5198));
		list.add(new Map2DItem(50, 6356));
		list.add(new Map2DItem(45, 7903));
		list.add(new Map2DItem(40, 9919));
		list.add(new Map2DItem(35, 13310));
		list.add(new Map2DItem(30, 17984));
		list.add(new Map2DItem(25, 26122));
		list.add(new Map2DItem(20, 41571));
		
		initMinAndMax();
	}
}
