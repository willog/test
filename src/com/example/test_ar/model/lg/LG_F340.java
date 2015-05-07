package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// G Flex
public class LG_F340 extends AModelMap
{
	public LG_F340()
	{
		super("LG-F340");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 420));
		list.add(new Map2DItem(175, 440));
		list.add(new Map2DItem(170, 473));
		list.add(new Map2DItem(165, 496));
		list.add(new Map2DItem(160, 543));
		list.add(new Map2DItem(155, 566));
		list.add(new Map2DItem(150, 603));
		list.add(new Map2DItem(145, 664));
		list.add(new Map2DItem(140, 702));
		list.add(new Map2DItem(135, 743));
		list.add(new Map2DItem(130, 815));
		list.add(new Map2DItem(125, 869));
		list.add(new Map2DItem(120, 942));
		list.add(new Map2DItem(115, 1036));
		list.add(new Map2DItem(110, 1134));
		list.add(new Map2DItem(105, 1217));
		list.add(new Map2DItem(100, 1352));
		list.add(new Map2DItem(95, 1524));
		list.add(new Map2DItem(90, 1722));
		list.add(new Map2DItem(85, 1936));
		list.add(new Map2DItem(80, 2210));
		list.add(new Map2DItem(75, 2476));
		list.add(new Map2DItem(70, 2868));
		list.add(new Map2DItem(65, 3336));
		list.add(new Map2DItem(60, 3937));
		list.add(new Map2DItem(55, 4762));
		list.add(new Map2DItem(50, 5814));
		list.add(new Map2DItem(45, 7140));
		list.add(new Map2DItem(40, 9175));
		list.add(new Map2DItem(35, 11884));
		list.add(new Map2DItem(30, 15756));
		list.add(new Map2DItem(25, 23412));
		list.add(new Map2DItem(20, 38220));

		initMinAndMax();
	}
}
