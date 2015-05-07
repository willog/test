package com.example.test_ar.model.pantech;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 베가 R3
public class IM_A850 extends AModelMap
{
	public IM_A850()
	{
		super("IM-A850");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 399));
		list.add(new Map2DItem(175, 399));
		list.add(new Map2DItem(170, 430));
		list.add(new Map2DItem(165, 453));
		list.add(new Map2DItem(160, 474));
		list.add(new Map2DItem(155, 530));
		list.add(new Map2DItem(150, 551));
		list.add(new Map2DItem(145, 602));
		list.add(new Map2DItem(140, 637));
		list.add(new Map2DItem(135, 676));
		list.add(new Map2DItem(130, 734));
		list.add(new Map2DItem(125, 803));
		list.add(new Map2DItem(120, 857));
		list.add(new Map2DItem(115, 946));
		list.add(new Map2DItem(110, 1058));
		list.add(new Map2DItem(105, 1158));
		list.add(new Map2DItem(100, 1260));
		list.add(new Map2DItem(95, 1332));
		list.add(new Map2DItem(90, 1560));
		list.add(new Map2DItem(85, 1722));
		list.add(new Map2DItem(80, 2048));
		list.add(new Map2DItem(75, 2304));
		list.add(new Map2DItem(70, 2654));
		list.add(new Map2DItem(65, 3136));
		list.add(new Map2DItem(60, 3666));
		list.add(new Map2DItem(55, 4460));
		list.add(new Map2DItem(50, 5488));
		list.add(new Map2DItem(45, 6724));
		list.add(new Map2DItem(40, 8887));
		list.add(new Map2DItem(35, 11502));
		list.add(new Map2DItem(30, 16006));
		list.add(new Map2DItem(25, 23179));
		list.add(new Map2DItem(20, 35437));

		initMinAndMax();
	}
}
