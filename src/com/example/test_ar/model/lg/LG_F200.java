package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 Vu2
public class LG_F200 extends AModelMap
{
	public LG_F200()
	{
		super("LG-F200");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 456));
		list.add(new Map2DItem(175, 475));
		list.add(new Map2DItem(170, 518));
		list.add(new Map2DItem(165, 564));
		list.add(new Map2DItem(160, 570));
		list.add(new Map2DItem(155, 588));
		list.add(new Map2DItem(150, 663));
		list.add(new Map2DItem(145, 680));
		list.add(new Map2DItem(140, 747));
		list.add(new Map2DItem(135, 803));
		list.add(new Map2DItem(130, 858));
		list.add(new Map2DItem(125, 906));
		list.add(new Map2DItem(120, 1000));
		list.add(new Map2DItem(115, 1062));
		list.add(new Map2DItem(110, 1158));
		list.add(new Map2DItem(105, 1278));
		list.add(new Map2DItem(100, 1425));
		list.add(new Map2DItem(95, 1542));
		list.add(new Map2DItem(90, 1768));
		list.add(new Map2DItem(85, 1972));
		list.add(new Map2DItem(80, 2234));
		list.add(new Map2DItem(75, 2723));
		list.add(new Map2DItem(70, 3038));
		list.add(new Map2DItem(65, 3357));
		list.add(new Map2DItem(60, 3922));
		list.add(new Map2DItem(55, 4806));
		list.add(new Map2DItem(50, 5977));
		list.add(new Map2DItem(45, 7398));
		list.add(new Map2DItem(40, 9515));
		list.add(new Map2DItem(35, 12083));
		list.add(new Map2DItem(30, 15917));
		list.add(new Map2DItem(25, 25424));
		list.add(new Map2DItem(20, 38802));

		initMinAndMax();
	}
}
