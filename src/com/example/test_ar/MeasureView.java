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
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class MeasureView extends View {
	private Bitmap mBmMeasureBg;
	private Bitmap mResizeBg;
	private int mWidth;
	private int mHeight;
	private int width;
	private int height;
	private int l;
	private int t;
	
	private Display display;	
	
	
	public MeasureView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
	    WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
	    display = wm.getDefaultDisplay();		

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
		mHeight = getHeight();;
		
		
		
		this.measure(MeasureSpec.UNSPECIFIED,MeasureSpec.UNSPECIFIED);
		
		width = this.getMeasuredWidth();
		height = this.getMeasuredHeight();
		
		canvas.drawBitmap(mBmMeasureBg, 0, 0, null);
		
		l = (mWidth*980) / 1280;
		t = (mHeight*(-80)) / 672;
	}

	private void initialize(Context context) {
		Resources r = getResources();
//		mBmMeasureBg = ShrinkBitmap(R.drawable.measure_bg, width, height);
		
		mWidth = display.getWidth();
		mHeight = display.getHeight();		
		

		if(mWidth == 1024 && mHeight == 720 ){ //뷰2
			mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg_768);		
		}else if(mWidth == 1280 && mHeight == 960) { // 뷰3
			mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg_960);
		}else{
			mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg);
		} 

	}
	
	public void terminate() {		
		mBmMeasureBg.recycle(); mBmMeasureBg = null;
		//mResizeBg.recycle(); mResizeBg = null;
	}
}
