package jp.androidgroup.nyartoolkit.utils.gl;

import com.example.test_ar.R;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Bitmapをスプライトとして表示するクラスです。
 */
public class AndGLBitmapSprite extends AndGLBasicSprite
{
	private int _internal_w;
	private int _internal_h;
	private Canvas canvas;
	private Paint mPaint;
	public AndGLBitmapSprite(AndGLView i_view,int i_w,int i_h)
	{
		super(i_view);
		//2^nサイズを求める。
		
//		mBmMeasureBg = ShrinkBitmap(R.drawable.measure_bg, width, height);
		
		
//			mBmMeasureBg = BitmapFactory.decodeResource(r, R.drawable.measure_bg_768);	
		
		int s=AndGLHelper.getPow2Size(i_w, i_h);
		this.setBitmap(Bitmap.createBitmap(s,s, Bitmap.Config.ARGB_8888),true);
		
		

//		this.setBitmap(BitmapFactory.decodeResource( null, R.drawable.ic_launcher, null), false);
		
//		canvas.drawBitmap(lockBitmap(), 0, 0, null);
		
		this._internal_w=i_w;
		this._internal_h=i_h;
	}
	private boolean _locked=false;
	public Bitmap lockBitmap()
	{
		assert this._locked==false;
		this._locked=true;
		return this._image;
	}
	public void unlockBitmap()
	{
		assert this._locked==true;
		this._locked=false;
		this.sync();
	}

	public void draw(int i_dx,int i_dy,int i_w,int i_h,int i_sx,int i_sy)
	{
		super.draw(i_dx, i_dy, i_w, i_h, i_sx, i_sy);
	}
	public void draw(int i_dx,int i_dy)
	{
		super.draw(i_dx, i_dy,this._internal_w, this._internal_h,0,0);
		
		mPaint.setColor(Color.BLUE);
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setStrokeWidth(3);		
		
		this._canvas.drawRect(100, 100, 200, 200, mPaint);
	}
}

