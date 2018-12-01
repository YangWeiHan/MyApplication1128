package com.example.flowlayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //获取自定义布局的资源ID
        final WeekFlowLayout flowLayout = findViewById(R.id.flowLayout);

        findViewById(R.id.clean).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flowLayout.removeAllViews();
            }
        });

        //输入框的资源ID
        final EditText main_edit = findViewById(R.id.main_edit);
        //获取按钮的资源ID  添加点击监听事件
        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = new TextView(MainActivity.this);
                //获取输入框里的值
                textView.setText(main_edit.getText());
                //设置字体颜色
                textView.setTextColor(Color.BLACK);
                //设置背景颜色
                textView.setBackgroundResource(R.drawable.edit_textview);
                //添加View
                flowLayout.addView(textView);

            }
        });

    }
}
