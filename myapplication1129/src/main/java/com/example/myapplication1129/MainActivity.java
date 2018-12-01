package com.example.myapplication1129;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import com.example.xlistview2.me.maxwin.view.XListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private XListView news;
    private int pager;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        news = findViewById(R.id.news);

        pager = 1;

        adapter = new MyAdapter(this);
        news.setAdapter(adapter);

        news.setPullLoadEnable(true);//支持加载(上拉)
        news.setPullRefreshEnable(true);//支持刷新(下拉)

        //获取 XListView 上拉下拉监听
        news.setXListViewListener(new XListView.IXListViewListener() {
            //刷新
            @Override
            public void onRefresh() {
            pager = 1;
            LoadData();
            }
            //加载
            @Override
            public void onLoadMore() {
            pager++;
            LoadData();
            }
        });
        //调用 加载数据的方法  刷新和加载时都要调用这个方法
        LoadData();
    }
    //创建一个   加载数据的 方法
    @SuppressLint("StaticFieldLeak")
    private void LoadData(){
        new AsyncTask<Void,Void,List<String>>(){
            @Override
            protected List<String> doInBackground(Void... voids) {
                //睡眠时间  (加载的时间)
                SystemClock.sleep(1000);
                //要添加数据   所以 实例化一个集合
                //把数据都存在这个集合里
                List<String> list = new ArrayList<>();
                //time  获取当前时间
                String time = new Date().toLocaleString();

                for (int i = 0; i <35 ; i++) {
                    list.add(time+"第"+pager+"页"+"第"+i+"条数据");
                }
                return list;
            }

            @Override
            protected void onPostExecute(List<String> strings) {
                if (pager == 1){
                    // 业务操作是下拉时   pager等于1
                    //下拉执行 setList
                    //先清除原来的数据在添加新的数据
                    adapter.setList(strings);
                }else {
                    //业务操作是上拉时 余数就不断增加了
                    //它执行的是加载  展示的是新的数据
                    adapter.addList(strings);
                }

                //停止刷新  停止加载
                //如果不写的话 就会一直刷新或加载数据
                //所以刷新或加载以后要先停止一下
                news.stopRefresh();
                news.stopLoadMore();
            }
        }.execute();
    }
}
