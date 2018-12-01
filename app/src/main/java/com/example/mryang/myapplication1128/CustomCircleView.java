package com.example.mryang.myapplication1128;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CustomCircleView extends View {
    Paint mpaint;
    RectF rectF;
    float mStartAngle = 0 ;

    public CustomCircleView(Context context) {
        super(context);
        init();
    }

    public CustomCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mpaint = new Paint();
        mpaint.setColor(Color.MAGENTA);
        mpaint.setStrokeWidth(10);
        mpaint.setStyle(Paint.Style.FILL);

        rectF = new RectF();
        rectF.top = 100;
        rectF.bottom = 600;
        rectF.left = 100;
        rectF.right = 600;

        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    float x = event.getX();
                    float y = event.getY();
                }else if (event.getAction() == MotionEvent.ACTION_MOVE){
                    float x = event.getX();
                    float y = event.getY();
                }
                invalidate();
                return true;
            }
        });
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < 8 ; i++){
            if (i%2 == 0){
                mpaint.setColor(Color.LTGRAY);
            }else{
                mpaint.setColor(Color.CYAN);
            }
            canvas.drawArc(rectF,mStartAngle,60,true,mpaint);
            mStartAngle += 60;
        }
        mpaint.setColor(Color.BLUE);
        canvas.drawText("开始",400,500,mpaint);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }
}
