package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 LTE2
public class LG_F160 extends AModelMap
{
	public LG_F160()
	{
		super("LG-F160");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 450));
		list.add(new Map2DItem(175, 480));
		list.add(new Map2DItem(170, 495));
		list.add(new Map2DItem(165, 561));
		list.add(new Map2DItem(160, 574));
		list.add(new Map2DItem(155, 623));
		list.add(new Map2DItem(150, 648));
		list.add(new Map2DItem(145, 688));
		list.add(new Map2DItem(140, 756));
		list.add(new Map2DItem(135, 793));
		list.add(new Map2DItem(130, 853));
		list.add(new Map2DItem(125, 938));
		list.add(new Map2DItem(120, 1015));
		list.add(new Map2DItem(115, 1108));
		list.add(new Map2DItem(110, 1194));
		list.add(new Map2DItem(105, 1319));
		list.add(new Map2DItem(100, 1486));
		list.add(new Map2DItem(95, 1508));
		list.add(new Map2DItem(90, 1742));
		list.add(new Map2DItem(85, 2054));
		list.add(new Map2DItem(80, 2235));
		list.add(new Map2DItem(75, 2631));
		list.add(new Map2DItem(70, 2942));
		list.add(new Map2DItem(65, 3364));
		list.add(new Map2DItem(60, 3552));
		list.add(new Map2DItem(55, 4942));
		list.add(new Map2DItem(50, 6030));
		list.add(new Map2DItem(45, 7630));
		list.add(new Map2DItem(40, 9803));
		list.add(new Map2DItem(35, 12495));
		list.add(new Map2DItem(30, 17555));
		list.add(new Map2DItem(25, 25607));
		list.add(new Map2DItem(20, 40508));

		initMinAndMax();
	}
}
