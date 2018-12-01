package com.example.ballviewdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class BallViewDemo extends View {
    Paint mpaint;
    float moveX = 300;
    float moveY = 300;
    public BallViewDemo(Context context) {
        super(context);
        init();
    }

    public BallViewDemo(Context context,  AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mpaint = new Paint();
        mpaint.setColor(Color.GREEN);
        mpaint.setTextSize(60);
        mpaint.setStrokeWidth(10);
        mpaint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mpaint.setColor(Color.GREEN);
        canvas.drawColor(R.color.colorBack);
        canvas.drawCircle(moveX,moveY,80,mpaint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.moveX = event.getX();
        this.moveY = event.getY();
        this.invalidate();
        return true;

    }
}
