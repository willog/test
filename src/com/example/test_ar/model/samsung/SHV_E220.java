package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 팝
public class SHV_E220 extends AModelMap
{
	public SHV_E220()
	{
		super("SHV-E220");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 399));
		list.add(new Map2DItem(175, 417));
		list.add(new Map2DItem(170, 432));
		list.add(new Map2DItem(165, 476));
		list.add(new Map2DItem(160, 537));
		list.add(new Map2DItem(155, 506));
		list.add(new Map2DItem(150, 540));
		list.add(new Map2DItem(145, 596));
		list.add(new Map2DItem(140, 637));
		list.add(new Map2DItem(135, 696));
		list.add(new Map2DItem(130, 776));
		list.add(new Map2DItem(125, 869));
		list.add(new Map2DItem(120, 916));
		list.add(new Map2DItem(115, 1024));
		list.add(new Map2DItem(110, 1108));
		list.add(new Map2DItem(105, 1192));
		list.add(new Map2DItem(100, 1264));
		list.add(new Map2DItem(95, 1318));
		list.add(new Map2DItem(90, 1353));
		list.add(new Map2DItem(85, 1500));
		list.add(new Map2DItem(80, 1784));
		list.add(new Map2DItem(75, 2072));
		list.add(new Map2DItem(70, 2180));
		list.add(new Map2DItem(65, 2864));
		list.add(new Map2DItem(60, 3246));
		list.add(new Map2DItem(55, 4459));
		list.add(new Map2DItem(50, 5314));
		list.add(new Map2DItem(45, 6900));
		list.add(new Map2DItem(40, 8320));
		list.add(new Map2DItem(35, 11277));
		list.add(new Map2DItem(30, 15931));
		list.add(new Map2DItem(25, 20610));
		list.add(new Map2DItem(20, 35952));
		
		initMinAndMax();
	}
}
