package com.example.customwaterfallviewgroup;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomWaterFallViewGroup extends LinearLayout {
    //设置每一行最大的字符串的长度
    int mMaxSize = 22;
    //传入的字符串数组
    List<String> stringList = new ArrayList<>();
    Context mcontext;

    public CustomWaterFallViewGroup(Context context) {
        super(context);
        mcontext = context;
        init();
    }

    public CustomWaterFallViewGroup(Context context,AttributeSet attrs) {
        super(context, attrs);
        mcontext = context;
        init();
    }
    //定义布局
    private void init() {
        //设置最外层的LinearLayout  为垂直布局
        setOrientation(VERTICAL);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        DisplayMetrics displayMetrics = mcontext.getResources().getDisplayMetrics();
        int widthPixels = displayMetrics.widthPixels;
        setMeasuredDimension(widthPixels,heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setData(List<String> stringList) {
        //上一个输入框里的数据存到这个页面的集合中 
        this.stringList = stringList;
        showData();
    }

    private void showData() {
        //因为每一次都要重新画 ，所以移除之前的布局  显示更新过的布局
       removeAllViews();
       //优先向跟布局添加一条横向布局
        LinearLayout linearLayout_h = (LinearLayout) View.inflate(mcontext,R.layout.item_water_fall_h,null);
        addView(linearLayout_h);
        //定义临时变量。用来计算最后一行已有的字符长度
        int len = 0;
        for (int i = 0;i<stringList.size();i++){
            String str = stringList.get(i);
            //将次字符串长度与记录的已有字符串长度相加
            len += str.length();
            //-判断  如果大于最大长度，说明这一行放不下了
            //需要自动换行
            if (len > mMaxSize){
                //像跟布局添加一条横布局
                linearLayout_h = (LinearLayout) View.inflate(mcontext,R.layout.item_water_fall_h,null);
                addView(linearLayout_h);
                //换行以后因为不添加了  所以  当前的救是最后一行的长度
                len = str.length();
            }
            //添加一个textView控件
            View view = View.inflate(mcontext,R.layout.water_fall_textview,null);
            //获取到它的ID
            TextView textView = view.findViewById(R.id.water_fall_textview);
            //得到后给它赋值  （输入框里的值  给它）
            textView.setText(str);
            //添加到布局中
            linearLayout_h.addView(view);

            //设置权重 让每一行内所有的控件相加充满整行，并合理分配
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.weight = 1;
            view.setLayoutParams(layoutParams);


            final int index = i;
            view.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mcontext,"您点击了"+stringList.get(index),Toast.LENGTH_SHORT).show();
                }
            });
            view.setOnLongClickListener(new OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    stringList.remove(index);
                    showData();
                    return false;
                }
            });
        }
    }


}
