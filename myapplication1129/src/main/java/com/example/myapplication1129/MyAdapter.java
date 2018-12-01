package com.example.myapplication1129;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends BaseAdapter {

    private Context context;
    private List<String> list;

    public MyAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }
    //lists  这个集合里存的就是  新加载的数据
    public void setList(List<String> lists){
        //下拉以后吧  原来的数据都清除
        list.clear();
        //之后再添加新的数据
        list.addAll(lists);
        //刷新
        notifyDataSetChanged();
    }

    //追加 数据
    public void addList(List<String> lists){
        //追加所有数据
        list.addAll(lists);
        //刷新
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public String getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            //加载视图
            convertView = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
            //实例化 ViewHolder
            holder = new ViewHolder(convertView);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        //吧集合里的值传给bindData()里的 title
        //之后 title 会把值赋给textview
        holder.bindData(getItem(position));
        return convertView;
    }
    //创建寄存器
    class ViewHolder{

        TextView textView;

        public ViewHolder(View ConvertView){
            //加载视图
            this.textView = ConvertView.findViewById(R.id.title_title);
            ConvertView.setTag(this);
        }
        //创建一个方法  绑定布局文件中textview 的 数据
        public void bindData(String title){
            //给textview 进行赋值
            textView.setText(title);
        }

    }
}
