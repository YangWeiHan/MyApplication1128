package com.example.customcircleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent intent = getIntent();

        ArrayList<Integer> list = intent.getIntegerArrayListExtra("list");
        int aa = list.get(0);
        int bb = list.get(1);
        int cc = list.get(2);

        int[] num = new int[]{aa,bb,cc};

        CustomView customView = findViewById(R.id.custom);

        customView.setData(num);

    }
}
