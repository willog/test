package com.example.test_ar.model.lg;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 옵티머스 G
public class LG_F180 extends AModelMap
{
	public LG_F180()
	{
		super("LG-F180");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 410));
		list.add(new Map2DItem(175, 420));
		list.add(new Map2DItem(170, 452));
		list.add(new Map2DItem(165, 474));
		list.add(new Map2DItem(160, 506));
		list.add(new Map2DItem(155, 552));
		list.add(new Map2DItem(150, 575));
		list.add(new Map2DItem(145, 639));
		list.add(new Map2DItem(140, 676));
		list.add(new Map2DItem(135, 716));
		list.add(new Map2DItem(130, 803));
		list.add(new Map2DItem(125, 844));
		list.add(new Map2DItem(120, 920));
		list.add(new Map2DItem(115, 1013));
		list.add(new Map2DItem(110, 1075));
		list.add(new Map2DItem(105, 1196));
		list.add(new Map2DItem(100, 1319));
		list.add(new Map2DItem(95, 1484));
		list.add(new Map2DItem(90, 1683));
		list.add(new Map2DItem(85, 1848));
		list.add(new Map2DItem(80, 2117));
		list.add(new Map2DItem(75, 2404));
		list.add(new Map2DItem(70, 2785));
		list.add(new Map2DItem(65, 3227));
		list.add(new Map2DItem(60, 3816));
		list.add(new Map2DItem(55, 4527));
		list.add(new Map2DItem(50, 5562));
		list.add(new Map2DItem(45, 6857));
		list.add(new Map2DItem(40, 8966));
		list.add(new Map2DItem(35, 11750));
		list.add(new Map2DItem(30, 15555));
		list.add(new Map2DItem(25, 23272));
		list.add(new Map2DItem(20, 38720));

		initMinAndMax();
	}
}
