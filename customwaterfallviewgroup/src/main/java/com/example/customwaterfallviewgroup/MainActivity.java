package com.example.customwaterfallviewgroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> stringList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        final EditText editText = findViewById(R.id.edit);
        final CustomWaterFallViewGroup customWaterFallViewGroup = findViewById(R.id.water_fill);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取输入框的值
                String str = editText.getText().toString();
                //将文字放入列表
                stringList.add(str);
                //设置数据
               customWaterFallViewGroup.setData(stringList);
            }
        });

    }
}
