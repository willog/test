package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// G3
public class LG_F500 extends AModelMap
{
	public LG_F500()
	{
		super("LG-F500");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 422));
		list.add(new Map2DItem(175, 445));
		list.add(new Map2DItem(170, 488));
		list.add(new Map2DItem(165, 508));
		list.add(new Map2DItem(160, 530));
		list.add(new Map2DItem(155, 565));
		list.add(new Map2DItem(150, 600));
		list.add(new Map2DItem(145, 663));
		list.add(new Map2DItem(140, 716));
		list.add(new Map2DItem(135, 756));
		list.add(new Map2DItem(130, 818));
		list.add(new Map2DItem(125, 904));
		list.add(new Map2DItem(120, 966));
		list.add(new Map2DItem(115, 1060));
		list.add(new Map2DItem(110, 1142));
		list.add(new Map2DItem(105, 1262));
		list.add(new Map2DItem(100, 1388));
		list.add(new Map2DItem(95, 1560));
		list.add(new Map2DItem(90, 1746));
		list.add(new Map2DItem(85, 1961));
		list.add(new Map2DItem(80, 2234));
		list.add(new Map2DItem(75, 2504));
		list.add(new Map2DItem(70, 2896));
		list.add(new Map2DItem(65, 3430));
		list.add(new Map2DItem(60, 4041));
		list.add(new Map2DItem(55, 4802));
		list.add(new Map2DItem(50, 5959));
		list.add(new Map2DItem(45, 7511));
		list.add(new Map2DItem(40, 9510));
		list.add(new Map2DItem(35, 12473));
		list.add(new Map2DItem(30, 16652));
		list.add(new Map2DItem(25, 24274));
		list.add(new Map2DItem(20, 39732));
		
		initMinAndMax();
	}
}
