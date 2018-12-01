package com.example.customcircleview2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CustomTextView extends View {
    Paint mPaint;
    public CustomTextView(Context context) {
        super(context);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(10);
        mPaint.setTextSize(60);
        mPaint.setStyle(Paint.Style.FILL);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        RectF rectF = new RectF();
        rectF.top = 100;
        rectF.bottom = 400;
        rectF.right = 450;
        rectF.left = 150;

        mPaint.setColor(Color.GREEN);
        canvas.drawText("GO",260,275,mPaint);
    }
}
