package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S4
public class SHV_E300 extends AModelMap
{
	public SHV_E300()
	{
		super("SHV-E300");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 484));
		list.add(new Map2DItem(175, 512));
		list.add(new Map2DItem(170, 532));
		list.add(new Map2DItem(165, 556));
		list.add(new Map2DItem(160, 602));
		list.add(new Map2DItem(155, 650));
		list.add(new Map2DItem(150, 706));
		list.add(new Map2DItem(145, 756));
		list.add(new Map2DItem(140, 827));
		list.add(new Map2DItem(135, 870));
		list.add(new Map2DItem(130, 964));
		list.add(new Map2DItem(125, 1056));
		list.add(new Map2DItem(120, 1112));
		list.add(new Map2DItem(115, 1236));
		list.add(new Map2DItem(110, 1344));
		list.add(new Map2DItem(105, 1486));
		list.add(new Map2DItem(100, 1648));
		list.add(new Map2DItem(95, 1866));
		list.add(new Map2DItem(90, 2080));
		list.add(new Map2DItem(85, 2284));
		list.add(new Map2DItem(80, 2694));
		list.add(new Map2DItem(75, 2973));
		list.add(new Map2DItem(70, 3409));
		list.add(new Map2DItem(65, 3993));
		list.add(new Map2DItem(60, 4704));
		list.add(new Map2DItem(55, 5577));
		list.add(new Map2DItem(50, 6810));
		list.add(new Map2DItem(45, 8509));
		list.add(new Map2DItem(40, 10771));
		list.add(new Map2DItem(35, 14220));
		list.add(new Map2DItem(30, 19319));
		list.add(new Map2DItem(25, 27907));
		list.add(new Map2DItem(20, 45041));
		
		initMinAndMax();
	}
}
