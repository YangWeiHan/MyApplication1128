package com.example.customcircleview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomBingView extends View {
    float[] mAngles = new float[]{30,30,30,30,30,30,30,30,30,30,30,30};
    Paint mpaint;
    RectF rectF;
    float mStartAngle = 0 ;
    public CustomBingView(Context context) {
        super(context);
        init();
    }

    public CustomBingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public void setData(float[] angles){
        mAngles = angles;
    }

    private void init(){
        mpaint = new Paint();
        mpaint.setColor(Color.BLUE);
        mpaint.setStrokeWidth(10);
        mpaint.setTextSize(60);
        mpaint.setStyle(Paint.Style.FILL);

        rectF = new RectF();
        rectF.top = 100;
        rectF.bottom = 400;
        rectF.right = 450;
        rectF.left = 150;

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < mAngles.length; i++) {
            if (i%2 == 0){
                mpaint.setColor(Color.MAGENTA);
            }else {
             mpaint.setColor(Color.CYAN);
            }
            canvas.drawArc(rectF,mStartAngle,mAngles[i],true,mpaint);
            mStartAngle += mAngles[i];
        }
    }
}
