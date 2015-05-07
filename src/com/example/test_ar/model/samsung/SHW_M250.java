package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시S2
public class SHW_M250 extends AModelMap
{
	public SHW_M250()
	{
		super("SHW-M250");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 451));
		list.add(new Map2DItem(175, 476));
		list.add(new Map2DItem(170, 506));
		list.add(new Map2DItem(165, 540));
		list.add(new Map2DItem(160, 576));
		list.add(new Map2DItem(155, 602));
		list.add(new Map2DItem(150, 652));
		list.add(new Map2DItem(145, 715));
		list.add(new Map2DItem(140, 756));
		list.add(new Map2DItem(135, 798));
		list.add(new Map2DItem(130, 866));
		list.add(new Map2DItem(125, 934));
		list.add(new Map2DItem(120, 1041));
		list.add(new Map2DItem(115, 1110));
		list.add(new Map2DItem(110, 1234));
		list.add(new Map2DItem(105, 1353));
		list.add(new Map2DItem(100, 1484));
		list.add(new Map2DItem(95, 1683));
		list.add(new Map2DItem(90, 1680));
		list.add(new Map2DItem(85, 2070));
		list.add(new Map2DItem(80, 2403));
		list.add(new Map2DItem(75, 2705));
		list.add(new Map2DItem(70, 3112));
		list.add(new Map2DItem(65, 3676));
		list.add(new Map2DItem(60, 4240));
		list.add(new Map2DItem(55, 5161));
		list.add(new Map2DItem(50, 6408));
		list.add(new Map2DItem(45, 7843));
		list.add(new Map2DItem(40, 10216));
		list.add(new Map2DItem(35, 13436));
		list.add(new Map2DItem(30, 18119));
		list.add(new Map2DItem(25, 25682));
		list.add(new Map2DItem(20, 43260));

		initMinAndMax();
	}
}
