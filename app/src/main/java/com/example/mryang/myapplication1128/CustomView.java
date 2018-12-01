package com.example.mryang.myapplication1128;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
      Paint mpaint;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        mpaint = new Paint();
        mpaint.setColor(Color.BLUE);
        mpaint.setStyle(Paint.Style.FILL);
        mpaint.setStrokeWidth(10);
            }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mpaint.setColor(Color.RED);
        canvas.drawRect(50,100,160,300,mpaint);
        mpaint.setColor(Color.GREEN);
        canvas.drawRect(200,50,310,300,mpaint);
        mpaint.setColor(Color.MAGENTA);
        canvas.drawRect(350,80,460,300,mpaint);

        mpaint.setColor(Color.YELLOW);
      /*  canvas.drawLine(25,300,500,300,mpaint);
        canvas.drawLine(25,25,25,300,mpaint);*/
         canvas.drawLine(0,0,0,300,mpaint);
         canvas.drawLine(0,300,500,300,mpaint);

        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,200,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,195,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,190,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,185,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,180,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,175,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,170,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,165,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,160,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,155,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,150,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,145,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,149,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,135,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,130,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,125,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,120,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,115,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,110,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,105,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,100,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,95,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,90,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,85,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,80,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,75,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,70,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,65,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,60,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,55,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,50,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,45,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,40,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,35,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,30,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,25,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,20,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,15,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,10,mpaint);
        mpaint.setColor(Color.LTGRAY);
        canvas.drawCircle(300,600,5,mpaint);
        mpaint.setColor(Color.CYAN);
        canvas.drawCircle(300,600,1,mpaint);

    }

}
