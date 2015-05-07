package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시노트2
public class SHV_E250 extends AModelMap
{
	public SHV_E250()
	{
		super("SHV-E250");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 370));
		list.add(new Map2DItem(175, 401));
		list.add(new Map2DItem(170, 430));
		list.add(new Map2DItem(165, 451));
		list.add(new Map2DItem(160, 462));
		list.add(new Map2DItem(155, 510));
		list.add(new Map2DItem(150, 529));
		list.add(new Map2DItem(145, 600));
		list.add(new Map2DItem(140, 638));
		list.add(new Map2DItem(135, 689));
		list.add(new Map2DItem(130, 706));
		list.add(new Map2DItem(125, 799));
		list.add(new Map2DItem(120, 812));
		list.add(new Map2DItem(115, 930));
		list.add(new Map2DItem(110, 1042));
		list.add(new Map2DItem(105, 1110));
		list.add(new Map2DItem(100, 1214));
		list.add(new Map2DItem(95, 1302));
		list.add(new Map2DItem(90, 1487));
		list.add(new Map2DItem(85, 1768));
		list.add(new Map2DItem(80, 1948));
		list.add(new Map2DItem(75, 2221));
		list.add(new Map2DItem(70, 2585));
		list.add(new Map2DItem(65, 3040));
		list.add(new Map2DItem(60, 3615));
		list.add(new Map2DItem(55, 4284));
		list.add(new Map2DItem(50, 5280));
		list.add(new Map2DItem(45, 6515));
		list.add(new Map2DItem(40, 8407));
		list.add(new Map2DItem(35, 11040));
		list.add(new Map2DItem(30, 14598));
		list.add(new Map2DItem(25, 22893));
		list.add(new Map2DItem(20, 22893));
		
		initMinAndMax();
	}
}
