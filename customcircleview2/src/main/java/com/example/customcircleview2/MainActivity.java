package com.example.customcircleview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;

public class MainActivity extends AppCompatActivity {
    CustomCircleView customCircleView;
    private CustomBingView customBingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customBingView = findViewById(R.id.bing);

        findViewById(R.id.yuan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees = (float) (720+Math.random()*10000);

                RotateAnimation rotateAnimation = new RotateAnimation(0,degrees,300,250);
                rotateAnimation.setDuration(5000);
                rotateAnimation.setFillAfter(true);
                customBingView.startAnimation(rotateAnimation);
            }
        });

        //initView();
    }

    /*private void initView() {
        CustomBingView customBingView  = findViewById(R.id.bing);
        findViewById(R.id.yuan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float degrees = (float) (720+Math.random()*1000);

                RotateAnimation rotateAnimation = new RotateAnimation(0,degrees,300,250);
                rotateAnimation.setDuration(5000);
                rotateAnimation.setFillAfter(true);
                customCircleView.startAnimation(rotateAnimation);
            }
        });
        float[] mAngles = new float[]{30,30,30,30,30,30,30,30,30,30,30,30};
        CustomBingView customBingView = findViewById(R.id.bing);
        customBingView.setData(mAngles);
        customBingView.invalidate();
    }*/
}
