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
	private Bitmap mResizeBg;
	private int mWidth;
	private int mHeight;
	private int width;
	private int height;
	private int l;
	private int t;
	
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
		mHeight = getHeight();;
		
		
		
		this.measure(MeasureSpec.UNSPECIFIED,MeasureSpec.UNSPECIFIED);
		
		width = this.getMeasuredWidth();
		height = this.getMeasuredHeight();
		
		canvas.drawBitmap(mBmMeasureBg, 0, 0, null);
		
		l = (mWidth*980) / 1280;
		t = (mHeight*(-80)) / 672;
	}

	Bitmap ShrinkBitmap(int file, int width, int height){
		Resources r = getResources();
	     BitmapFactory.Options bmpFactoryOptions = new BitmapFactory.Options();
	        bmpFactoryOptions.inJustDecodeBounds = true;
	        Bitmap bitmap = BitmapFactory.decodeResource(r, file, bmpFactoryOptions);
	        
	        int heightRatio = (int)Math.ceil(bmpFactoryOptions.outHeight/(float)height);
	        int widthRatio = (int)Math.ceil(bmpFactoryOptions.outWidth/(float)width);
	        
	        if (heightRatio > 1 || widthRatio > 1)
	        {
	         if (heightRatio > widthRatio)
	         {
	          bmpFactoryOptions.inSampleSize = heightRatio;
	         } else {
	          bmpFactoryOptions.inSampleSize = widthRatio; 
	         }
	        }
	        
	        bmpFactoryOptions.inJustDecodeBounds = false;
	        bitmap = BitmapFactory.decodeResource(r, file, bmpFactoryOptions);
	     return bitmap;
	    }	
	
	private void initialize(Context context) {
		Resources r = getResources();
//		mBmMeasureBg = ShrinkBitmap(R.drawable.measure_bg, width, height);
		
		mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg);
//		mResizeBg = Bitmap.createScaledBitmap(mBmMeasureBg, l, t, false);

	}
	
	public void terminate() {		
		mBmMeasureBg.recycle(); mBmMeasureBg = null;
		//mResizeBg.recycle(); mResizeBg = null;
	}
}
