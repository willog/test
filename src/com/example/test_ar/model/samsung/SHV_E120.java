package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S2 HD LTE
public class SHV_E120 extends AModelMap
{
	public SHV_E120()
	{
		super("SHV-E120");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 486));
		list.add(new Map2DItem(175, 525));
		list.add(new Map2DItem(170, 514));
		list.add(new Map2DItem(165, 578));
		list.add(new Map2DItem(160, 619));
		list.add(new Map2DItem(155, 628));
		list.add(new Map2DItem(150, 708));
		list.add(new Map2DItem(145, 776));
		list.add(new Map2DItem(140, 815));
		list.add(new Map2DItem(135, 889));
		list.add(new Map2DItem(130, 902));
		list.add(new Map2DItem(125, 966));
		list.add(new Map2DItem(120, 1060));
		list.add(new Map2DItem(115, 1141));
		list.add(new Map2DItem(110, 1263));
		list.add(new Map2DItem(105, 1387));
		list.add(new Map2DItem(100, 1501));
		list.add(new Map2DItem(95, 1743));
		list.add(new Map2DItem(90, 1822));
		list.add(new Map2DItem(85, 2004));
		list.add(new Map2DItem(80, 1984));
		list.add(new Map2DItem(75, 2360));
		list.add(new Map2DItem(70, 2943));
		list.add(new Map2DItem(65, 3528));
		list.add(new Map2DItem(60, 4330));
		list.add(new Map2DItem(55, 5148));
		list.add(new Map2DItem(50, 6323));
		list.add(new Map2DItem(45, 7752));
		list.add(new Map2DItem(40, 9572));
		list.add(new Map2DItem(35, 13295));
		list.add(new Map2DItem(30, 17371));
		list.add(new Map2DItem(25, 26694));
		list.add(new Map2DItem(20, 50000));
		
		initMinAndMax();
	}
}
