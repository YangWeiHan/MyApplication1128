package com.example.customcircleview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomCircleView extends View {

     Paint mpaint;
     RectF rectF;
    float mStartAngle = 0 ;
    public CustomCircleView(Context context) {
        super(context);
        init();
    }

    public CustomCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        mpaint = new Paint();
        mpaint.setColor(Color.BLUE);
        mpaint.setStrokeWidth(10);
        mpaint.setTextSize(60);
        mpaint.setStyle(Paint.Style.FILL);



    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //canvas.drawRect(); 矩形
        //canvas.drawArc();    扇形
        //canvas.drawCircle();  圆形
        //canvas.drawLine();  线性\


        mpaint.setColor(Color.BLACK);
        Path path = new Path();
        path.moveTo(300,140);
        path.lineTo(220,250);
        path.lineTo(380,250);
        path.close();
        canvas.drawPath(path,mpaint);

        mpaint.setColor(Color.YELLOW);
        canvas.drawCircle(300,250,80,mpaint);
    }
}
