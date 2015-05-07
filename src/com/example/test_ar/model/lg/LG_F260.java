package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 LTE3
public class LG_F260 extends AModelMap
{
	public LG_F260()
	{
		super("LG-F260");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 440));
		list.add(new Map2DItem(175, 474));
		list.add(new Map2DItem(170, 519));
		list.add(new Map2DItem(165, 556));
		list.add(new Map2DItem(160, 615));
		list.add(new Map2DItem(155, 651));
		list.add(new Map2DItem(150, 665));
		list.add(new Map2DItem(145, 742));
		list.add(new Map2DItem(140, 756));
		list.add(new Map2DItem(135, 805));
		list.add(new Map2DItem(130, 886));
		list.add(new Map2DItem(125, 936));
		list.add(new Map2DItem(120, 1009));
		list.add(new Map2DItem(115, 1134));
		list.add(new Map2DItem(110, 1225));
		list.add(new Map2DItem(105, 1328));
		list.add(new Map2DItem(100, 1494));
		list.add(new Map2DItem(95, 1652));
		list.add(new Map2DItem(90, 1806));
		list.add(new Map2DItem(85, 1986));
		list.add(new Map2DItem(80, 2633));
		list.add(new Map2DItem(75, 2602));
		list.add(new Map2DItem(70, 3002));
		list.add(new Map2DItem(65, 3512));
		list.add(new Map2DItem(60, 4064));
		list.add(new Map2DItem(55, 5007));
		list.add(new Map2DItem(50, 6007));
		list.add(new Map2DItem(45, 7366));
		list.add(new Map2DItem(40, 9475));
		list.add(new Map2DItem(35, 12604));
		list.add(new Map2DItem(30, 17180));
		list.add(new Map2DItem(25, 23793));
		list.add(new Map2DItem(20, 35911));

		initMinAndMax();
	}
}
