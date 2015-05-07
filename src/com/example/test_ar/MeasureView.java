/** 배경이 되는 구름이 없는 하늘 뷰 **/
package com.example.test_ar;

import com.example.test_ar.R;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MeasureView extends View {
	private Bitmap mBmMeasureBg;
	private int mWidth;
	private int mHeight;
	
	public MeasureView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialize(context);
	}
	
	public MeasureView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}
	
	public MeasureView(Context context) {
		this(context, null, 0);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		mWidth = getWidth();
		mHeight = getHeight();
		
		canvas.drawBitmap(mBmMeasureBg, 0, 0, null);
		
		float l = (mWidth*980) / 1280;
		float t = (mHeight*(-80)) / 672;
	}

	private void initialize(Context context) {
		Resources r = getResources();
		mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg);
	}
	
	public void terminate() {		
		mBmMeasureBg.recycle(); mBmMeasureBg = null;
	}
}
