package com.example.test_ar.model.samsung;

import java.util.ArrayList;

import com.example.test_ar.AModelMap;
import com.example.test_ar.Map2DItem;

// 갤럭시 Win
public class SHV_E500 extends AModelMap
{
	public SHV_E500()
	{
		super("SHV-E500");
		
		ArrayList<Map2DItem> list = getList();
		
		list.clear();
		
		list.add(new Map2DItem(180, 518));
		list.add(new Map2DItem(175, 540));
		list.add(new Map2DItem(170, 600));
		list.add(new Map2DItem(165, 612));
		list.add(new Map2DItem(160, 637));
		list.add(new Map2DItem(155, 701));
		list.add(new Map2DItem(150, 743));
		list.add(new Map2DItem(145, 784));
		list.add(new Map2DItem(140, 830));
		list.add(new Map2DItem(135, 915));
		list.add(new Map2DItem(130, 970));
		list.add(new Map2DItem(125, 1064));
		list.add(new Map2DItem(120, 1161));
		list.add(new Map2DItem(115, 1256));
		list.add(new Map2DItem(110, 1374));
		list.add(new Map2DItem(105, 1466));
		list.add(new Map2DItem(100, 1682));
		list.add(new Map2DItem(95, 1896));
		list.add(new Map2DItem(90, 2028));
		list.add(new Map2DItem(85, 2338));
		list.add(new Map2DItem(80, 2685));
		list.add(new Map2DItem(75, 3136));
		list.add(new Map2DItem(70, 3600));
		list.add(new Map2DItem(65, 4096));
		list.add(new Map2DItem(60, 4974));
		list.add(new Map2DItem(55, 5967));
		list.add(new Map2DItem(50, 7233));
		list.add(new Map2DItem(45, 9270));
		list.add(new Map2DItem(40, 11505));
		list.add(new Map2DItem(35, 15191));
		list.add(new Map2DItem(30, 21335));
		list.add(new Map2DItem(25, 30309));
		list.add(new Map2DItem(20, 30309));
		
		initMinAndMax();
	}
}
