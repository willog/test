package com.example.test_ar;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;

import com.example.test_ar.model.lg.LG_F100;
import com.example.test_ar.model.lg.LG_F180;
import com.example.test_ar.model.lg.LG_F240;
import com.example.test_ar.model.lg.LG_F300;
import com.example.test_ar.model.lg.LG_F320;
import com.example.test_ar.model.lg.LG_F340;
import com.example.test_ar.model.lg.LG_F350;
import com.example.test_ar.model.lg.LG_F400;
import com.example.test_ar.model.pantech.IM_A760;
import com.example.test_ar.model.pantech.IM_A800;
import com.example.test_ar.model.pantech.IM_A810;
import com.example.test_ar.model.pantech.IM_A830;
import com.example.test_ar.model.pantech.IM_A840;
import com.example.test_ar.model.pantech.IM_A850;
import com.example.test_ar.model.pantech.IM_A860;
import com.example.test_ar.model.pantech.IM_A870;
import com.example.test_ar.model.pantech.IM_A880;
import com.example.test_ar.model.pantech.IM_A890;
import com.example.test_ar.model.pantech.IM_A900;
import com.example.test_ar.model.samsung.SHV_E160;
import com.example.test_ar.model.samsung.SHV_E210;
import com.example.test_ar.model.samsung.SHV_E250;
import com.example.test_ar.model.samsung.SHV_E270;
import com.example.test_ar.model.samsung.SHV_E300;
import com.example.test_ar.model.samsung.SHV_E500;
import com.example.test_ar.model.samsung.SHW_M250;
import com.example.test_ar.model.samsung.SHW_M440;
import com.example.test_ar.model.samsung.SHW_M570;
import com.example.test_ar.model.samsung.SM_N900;

public class ModelMapFactory 
{
	private static final IModelMap[] ModelMaps = 
	{ 
		new SHW_M250(),	// 갤럭시 S2
		new SHW_M440(),	// 갤럭시S3 3G
		
//		new SHV_E110(),	// 갤럭시S2 LTE
//		new SHV_E120(),	// 갤럭시S3 HD LTE
		new SHV_E160(),	// 갤럭시노트1
		new SHV_E210(),	// 갤럭시S3 LTE
		new SHV_E250(),	// 갤럭시노트2
		new SHV_E270(),	// 갤럭시S3 그랜드
		new SHV_E300(),	// 갤럭시 S4
//		new SHV_E330(),	// 갤럭시S4 LTE-A
//		new SHV_E470(),	// 갤럭시S4 액티브
		new SHV_E500(),	// 갤럭시 Win
		new SHW_M570(),	// 갤럭시 어드밴스 코어
		new SM_N900(),	// 갤럭시노트3
//		new SM_G900(),	// 갤럭시S5
//		new SM_N750(),	// 갤럭시노트3 네오
		
		new LG_F100(),
		new LG_F180(),	// 옵티머스 G
		new LG_F240(),	// 옵티머스 G Pro
		new LG_F300(),	// VUE 3
		new LG_F320(),	// G2
		new LG_F340(),	// G Flex
		new LG_F350(),	// G Pro 2
		new LG_F400(),	// G3

//		new IM_A770(),	// 베가 레이서
		new IM_A760(),
		new IM_A800(),
		new IM_A810(),
		new IM_A830(),
		new IM_A840(),
		new IM_A850(),	// 베가 R3
		new IM_A860(),	// 베가 No.6
		new IM_A870(),
		new IM_A880(),
		new IM_A890(),
		new IM_A900(),	// 베가 시크릿 업
		
	};
	
	public static IModelMap FindMap(Context context)
	{
		DisplayMetrics dm = context.getResources().getDisplayMetrics();
		
		StringBuilder sb = new StringBuilder();
		sb.append("density : "); sb.append(dm.density);
		sb.append(", densityDpi : "); sb.append(dm.densityDpi);
		sb.append(", widthPixels : "); sb.append(dm.widthPixels);
		sb.append(", heightPixels : "); sb.append(dm.heightPixels);
		sb.append(", scaledDensity : "); sb.append(dm.scaledDensity);
		
		Log.d("test", sb.toString());
		
		for (IModelMap map : ModelMaps)
		{
			if (Build.MODEL.contains(map.getModel()))
			{
				Log.d("test", "find map for " + map.getModel());
				return map;
			}
		}
		
		return null;
	}
}
