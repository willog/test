package com.example.test_ar;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
 

public class Snippet extends View {
	private Paint mBaseLinePaint;
	
	public Snippet(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	protected void onDraw(Canvas canvas){
		canvas.drawLine(0, 240, 50, 300, mBaseLinePaint);
	}
	
	private void initialize() {
		
		mBaseLinePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		mBaseLinePaint.setColor(Color.parseColor("#7E7E7E"));
		mBaseLinePaint.setStrokeWidth(2.5f);
	}
	
}

