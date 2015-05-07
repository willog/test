package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// G Pro 2
public class LG_F350 extends AModelMap
{
	public LG_F350()
	{
		super("LG-F350");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 420));
		list.add(new Map2DItem(175, 462));
		list.add(new Map2DItem(170, 473));
		list.add(new Map2DItem(165, 496));
		list.add(new Map2DItem(160, 529));
		list.add(new Map2DItem(155, 576));
		list.add(new Map2DItem(150, 626));
		list.add(new Map2DItem(145, 650));
		list.add(new Map2DItem(140, 702));
		list.add(new Map2DItem(135, 754));
		list.add(new Map2DItem(130, 828));
		list.add(new Map2DItem(125, 882));
		list.add(new Map2DItem(120, 976));
		list.add(new Map2DItem(115, 1035));
		list.add(new Map2DItem(110, 1149));
		list.add(new Map2DItem(105, 1300));
		list.add(new Map2DItem(100, 1435));
		list.add(new Map2DItem(95, 1566));
		list.add(new Map2DItem(90, 1772));
		list.add(new Map2DItem(85, 1986));
		list.add(new Map2DItem(80, 2260));
		list.add(new Map2DItem(75, 2582));
		list.add(new Map2DItem(70, 3037));
		list.add(new Map2DItem(65, 3430));
		list.add(new Map2DItem(60, 4151));
		list.add(new Map2DItem(55, 4948));
		list.add(new Map2DItem(50, 6126));
		list.add(new Map2DItem(45, 7697));
		list.add(new Map2DItem(40, 9837));
		list.add(new Map2DItem(35, 13080));
		list.add(new Map2DItem(30, 17527));
		list.add(new Map2DItem(25, 25931));
		list.add(new Map2DItem(20, 44344));
		
		initMinAndMax();
	}
}
