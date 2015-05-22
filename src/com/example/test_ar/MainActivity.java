package com.example.test_ar;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
{

	public static IModelMap m_map;
	public static ArrayList<Map2DItem> m_measureList = new ArrayList<Map2DItem>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		m_map = ModelMapFactory.FindMap(this);
		if (m_map == null)
		{
			new AlertDialog.Builder(this)
				.setTitle("알림")
				.setMessage("이모델은 "+ m_map +"입니다. "+"모델명 : [" + Build.MODEL + "] 은 미지원 단말기 입니다.")
				.setPositiveButton("확인", new DialogInterface.OnClickListener() 
				{
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						dialog.dismiss();
						finish();
					}
				})
				.show();

			return ;
		}
		
		Button btn1 = (Button)findViewById(R.id.button1);
		btn1.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
			
				startActivity(new Intent(MainActivity.this, SimpleLiteActivity.class));
				
			}
		});
		
		Button btn2 = (Button)findViewById(R.id.button2);
		btn2.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				showMeasuredList();
			}
		});
	}
	
	@Override
	protected void onResume() 
	{
		super.onResume();
	}
	
	@Override
	protected void onDestroy() 
	{
		super.onDestroy();	
	}
	
	private void showMeasuredList()
	{
		StringBuilder sb = new StringBuilder();
		for (Map2DItem item : m_measureList)
		{
			sb.append("distance : ");
			sb.append(String.valueOf(item.getDistance()));
			sb.append(", Area : ");
			sb.append(String.valueOf(item.getStdArea()));
			sb.append("\n");
		}
		
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		alert.setMessage(sb.toString());
		alert.setPositiveButton("닫기", new DialogInterface.OnClickListener() 
		{
			@Override
			public void onClick(DialogInterface dialog, int which) 
			{
				dialog.dismiss();
			}
		});
		alert.show();
	}
	
	
}
