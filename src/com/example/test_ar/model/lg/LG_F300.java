package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// VUE 3
public class LG_F300 extends AModelMap
{
	public LG_F300()
	{
		super("LG-F300");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 410));
		list.add(new Map2DItem(175, 430));
		list.add(new Map2DItem(170, 463));
		list.add(new Map2DItem(165, 494));
		list.add(new Map2DItem(160, 506));
		list.add(new Map2DItem(155, 564));
		list.add(new Map2DItem(150, 576));
		list.add(new Map2DItem(145, 628));
		list.add(new Map2DItem(140, 690));
		list.add(new Map2DItem(135, 730));
		list.add(new Map2DItem(130, 812));
		list.add(new Map2DItem(125, 878));
		list.add(new Map2DItem(120, 920));
		list.add(new Map2DItem(115, 1028));
		list.add(new Map2DItem(110, 1094));
		list.add(new Map2DItem(105, 1194));
		list.add(new Map2DItem(100, 1282));
		list.add(new Map2DItem(95, 1523));
		list.add(new Map2DItem(90, 1562));
		list.add(new Map2DItem(85, 1875));
		list.add(new Map2DItem(80, 2103));
		list.add(new Map2DItem(75, 2430));
		list.add(new Map2DItem(70, 2838));
		list.add(new Map2DItem(65, 3338));
		list.add(new Map2DItem(60, 3970));
		list.add(new Map2DItem(55, 4729));
		list.add(new Map2DItem(50, 5700));
		list.add(new Map2DItem(45, 7144));
		list.add(new Map2DItem(40, 9181));
		list.add(new Map2DItem(35, 11665));
		list.add(new Map2DItem(30, 16132));
		list.add(new Map2DItem(25, 22724));
		list.add(new Map2DItem(20, 35638));

		initMinAndMax();
	}
}
