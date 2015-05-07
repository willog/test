package com.example.test_ar.model.pantech;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 베가 시크릿 업
public class IM_A900 extends AModelMap
{
	public IM_A900()
	{
		super("IM-A900");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 473));
		list.add(new Map2DItem(175, 495));
		list.add(new Map2DItem(170, 541));
		list.add(new Map2DItem(165, 552));
		list.add(new Map2DItem(160, 588));
		list.add(new Map2DItem(155, 650));
		list.add(new Map2DItem(150, 663));
		list.add(new Map2DItem(145, 715));
		list.add(new Map2DItem(140, 784));
		list.add(new Map2DItem(135, 842));
		list.add(new Map2DItem(130, 904));
		list.add(new Map2DItem(125, 964));
		list.add(new Map2DItem(120, 1068));
		list.add(new Map2DItem(115, 1142));
		list.add(new Map2DItem(110, 1279));
		list.add(new Map2DItem(105, 1428));
		list.add(new Map2DItem(100, 1562));
		list.add(new Map2DItem(95, 1722));
		list.add(new Map2DItem(90, 1942));
		list.add(new Map2DItem(85, 2162));
		list.add(new Map2DItem(80, 2500));
		list.add(new Map2DItem(75, 2840));
		list.add(new Map2DItem(70, 3250));
		list.add(new Map2DItem(65, 3815));
		list.add(new Map2DItem(60, 4497));
		list.add(new Map2DItem(55, 5310));
		list.add(new Map2DItem(50, 6683));
		list.add(new Map2DItem(45, 8055));
		list.add(new Map2DItem(40, 10353));
		list.add(new Map2DItem(35, 13415));
		list.add(new Map2DItem(30, 18366));
		list.add(new Map2DItem(25, 26404));
		list.add(new Map2DItem(20, 41224));

		initMinAndMax();
	}
}
