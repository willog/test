package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 Vu
public class LG_F100 extends AModelMap
{
	public LG_F100()
	{
		super("LG-F100");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 513));
		list.add(new Map2DItem(175, 526));
		list.add(new Map2DItem(170, 554));
		list.add(new Map2DItem(165, 587));
		list.add(new Map2DItem(160, 573));
		list.add(new Map2DItem(155, 640));
		list.add(new Map2DItem(150, 714));
		list.add(new Map2DItem(145, 762));
		list.add(new Map2DItem(140, 793));
		list.add(new Map2DItem(135, 844));
		list.add(new Map2DItem(130, 976));
		list.add(new Map2DItem(125, 1040));
		list.add(new Map2DItem(120, 1112));
		list.add(new Map2DItem(115, 1228));
		list.add(new Map2DItem(110, 1371));
		list.add(new Map2DItem(105, 1508));
		list.add(new Map2DItem(100, 1644));
		list.add(new Map2DItem(95, 1830));
		list.add(new Map2DItem(90, 1963));
		list.add(new Map2DItem(85, 2352));
		list.add(new Map2DItem(80, 2652));
		list.add(new Map2DItem(75, 3427));
		list.add(new Map2DItem(70, 3278));
		list.add(new Map2DItem(65, 3940));
		list.add(new Map2DItem(60, 4612));
		list.add(new Map2DItem(55, 5465));
		list.add(new Map2DItem(50, 6669));
		list.add(new Map2DItem(45, 8281));
		list.add(new Map2DItem(40, 10500));
		list.add(new Map2DItem(35, 13815));
		list.add(new Map2DItem(30, 20445));
		list.add(new Map2DItem(25, 26650));
		list.add(new Map2DItem(20, 37926));

		initMinAndMax();
	}
}
