package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 G Pro
public class LG_F240 extends AModelMap
{
	public LG_F240()
	{
		super("LG-F240");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 400));
		list.add(new Map2DItem(175, 430));
		list.add(new Map2DItem(170, 442));
		list.add(new Map2DItem(165, 473));
		list.add(new Map2DItem(160, 506));
		list.add(new Map2DItem(155, 551));
		list.add(new Map2DItem(150, 588));
		list.add(new Map2DItem(145, 613));
		list.add(new Map2DItem(140, 663));
		list.add(new Map2DItem(135, 729));
		list.add(new Map2DItem(130, 764));
		list.add(new Map2DItem(125, 848));
		list.add(new Map2DItem(120, 906));
		list.add(new Map2DItem(115, 954));
		list.add(new Map2DItem(110, 1110));
		list.add(new Map2DItem(105, 1210));
		list.add(new Map2DItem(100, 1317));
		list.add(new Map2DItem(95, 1463));
		list.add(new Map2DItem(90, 1625));
		list.add(new Map2DItem(85, 1873));
		list.add(new Map2DItem(80, 2120));
		list.add(new Map2DItem(75, 2403));
		list.add(new Map2DItem(70, 2730));
		list.add(new Map2DItem(65, 3252));
		list.add(new Map2DItem(60, 3844));
		list.add(new Map2DItem(55, 4490));
		list.add(new Map2DItem(50, 5554));
		list.add(new Map2DItem(45, 6807));
		list.add(new Map2DItem(40, 8648));
		list.add(new Map2DItem(35, 11398));
		list.add(new Map2DItem(30, 15882));
		list.add(new Map2DItem(25, 22951));
		list.add(new Map2DItem(20, 35121));

		initMinAndMax();
	}
}
