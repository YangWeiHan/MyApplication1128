package com.example.customcircleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edit_one,edit_two,edit_three;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        edit_one = findViewById(R.id.Edit_one);
        edit_two = findViewById(R.id.Edit_two);
        edit_three = findViewById(R.id.Edit_three);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Integer> list = new ArrayList<>();

                int inputchart_one = Integer.parseInt(edit_one.getText().toString());
                int inputchart_two = Integer.parseInt(edit_two.getText().toString());
                int inputchart_three = Integer.parseInt(edit_three.getText().toString());

                list.add(inputchart_one);
                list.add(inputchart_two);
                list.add(inputchart_three);

                Intent intent = new Intent(MainActivity.this,ShowActivity.class);

                intent.putIntegerArrayListExtra("list",list);
                startActivity(intent);
            }
        });
    }
}
