package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 S4 LTE-A
public class SHV_E330 extends AModelMap
{
	public SHV_E330()
	{
		super("SHV-E330");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 483));
		list.add(new Map2DItem(175, 506));
		list.add(new Map2DItem(170, 528));
		list.add(new Map2DItem(165, 552));
		list.add(new Map2DItem(160, 615));
		list.add(new Map2DItem(155, 637));
		list.add(new Map2DItem(150, 689));
		list.add(new Map2DItem(145, 744));
		list.add(new Map2DItem(140, 798));
		list.add(new Map2DItem(135, 870));
		list.add(new Map2DItem(130, 930));
		list.add(new Map2DItem(125, 1008));
		list.add(new Map2DItem(120, 1174));
		list.add(new Map2DItem(115, 1190));
		list.add(new Map2DItem(110, 1317));
		list.add(new Map2DItem(105, 1445));
		list.add(new Map2DItem(100, 1606));
		list.add(new Map2DItem(95, 1852));
		list.add(new Map2DItem(90, 2037));
		list.add(new Map2DItem(85, 2262));
		list.add(new Map2DItem(80, 2530));
		list.add(new Map2DItem(75, 2931));
		list.add(new Map2DItem(70, 3279));
		list.add(new Map2DItem(65, 3786));
		list.add(new Map2DItem(60, 4590));
		list.add(new Map2DItem(55, 5402));
		list.add(new Map2DItem(50, 6683));
		list.add(new Map2DItem(45, 8528));
		list.add(new Map2DItem(40, 11010));
		list.add(new Map2DItem(35, 14336));
		list.add(new Map2DItem(30, 19246));
		list.add(new Map2DItem(25, 28571));
		list.add(new Map2DItem(20, 43793));

		initMinAndMax();
	}
}
