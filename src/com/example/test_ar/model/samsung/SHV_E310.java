package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 메가
public class SHV_E310 extends AModelMap
{
	public SHV_E310()
	{
		super("SHV-E310");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 380));
		list.add(new Map2DItem(175, 410));
		list.add(new Map2DItem(170, 430));
		list.add(new Map2DItem(165, 473));
		list.add(new Map2DItem(160, 507));
		list.add(new Map2DItem(155, 529));
		list.add(new Map2DItem(150, 564));
		list.add(new Map2DItem(145, 650));
		list.add(new Map2DItem(140, 636));
		list.add(new Map2DItem(135, 715));
		list.add(new Map2DItem(130, 784));
		list.add(new Map2DItem(125, 812));
		list.add(new Map2DItem(120, 872));
		list.add(new Map2DItem(115, 961));
		list.add(new Map2DItem(110, 1056));
		list.add(new Map2DItem(105, 1190));
		list.add(new Map2DItem(100, 1315));
		list.add(new Map2DItem(95, 1462));
		list.add(new Map2DItem(90, 1564));
		list.add(new Map2DItem(85, 1621));
		list.add(new Map2DItem(80, 1787));
		list.add(new Map2DItem(75, 2092));
		list.add(new Map2DItem(70, 2424));
		list.add(new Map2DItem(65, 2817));
		list.add(new Map2DItem(60, 3509));
		list.add(new Map2DItem(55, 4290));
		list.add(new Map2DItem(50, 5329));
		list.add(new Map2DItem(45, 6561));
		list.add(new Map2DItem(40, 8378));
		list.add(new Map2DItem(35, 10874));
		list.add(new Map2DItem(30, 14463));
		list.add(new Map2DItem(25, 14463));
		list.add(new Map2DItem(20, 14463));
		
		initMinAndMax();
	}
}
