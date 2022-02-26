package com.azehaf.calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Restart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textExpression = findViewById(R.id.textView);
        Button buttonCalcule = findViewById(R.id.buttonCalcule);
        ListView listView = findViewById(R.id.listeView);
        List<String> list = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        buttonCalcule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String expression = textExpression.getText().toString();
                if (expression.contains("+")){
                    int a = Integer.valueOf(expression.split("\\+")[0]);
                    int b = Integer.valueOf(expression.split("\\+")[1]);
                    list.add(expression+" = "+String.valueOf(a+b));
                }else if(expression.contains("*")){
                    int a = Integer.valueOf(expression.split("\\*")[0]);
                    int b = Integer.valueOf(expression.split("\\*")[1]);
                    list.add(expression+" = "+String.valueOf(a*b));
                }else if(expression.contains("/")){
                    int a = Integer.valueOf(expression.split("\\/")[0]);
                    int b = Integer.valueOf(expression.split("\\/")[1]);
                    list.add(expression+" = "+String.valueOf(a/b));
                } else if(expression.contains("-")){
                    int a = Integer.valueOf(expression.split("\\-")[0]);
                    int b = Integer.valueOf(expression.split("\\-")[1]);
                    list.add(expression+" = "+String.valueOf(a-b));
                }
                adapter.notifyDataSetChanged();
            }
        });
    }
}