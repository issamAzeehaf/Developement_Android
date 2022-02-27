package com.azehaf.tp2calculatrice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    String input = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView zero = findViewById(R.id.Zero);
        CardView one = findViewById(R.id.One);
        CardView two = findViewById(R.id.Two);
        CardView three = findViewById(R.id.Three);
        CardView four = findViewById(R.id.Four);
        CardView five = findViewById(R.id.Five);
        CardView six = findViewById(R.id.Six);
        CardView seven = findViewById(R.id.Seven);
        CardView eight = findViewById(R.id.Eight);
        CardView nine = findViewById(R.id.Nine);
        CardView reset = findViewById(R.id.Reset);
        CardView back = findViewById(R.id.back);
        CardView multiplication = findViewById(R.id.multiplication);
        CardView soustraction = findViewById(R.id.Soustraction);
        CardView addition = findViewById(R.id.Addition);
        CardView division = findViewById(R.id.Division);
        CardView equal = findViewById(R.id.Equal);
        CardView point = findViewById(R.id.Point);
        TextView operation = findViewById(R.id.Operation);
        TextView result = findViewById(R.id.Result);
         zero.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                int a = 0;
                input = input +String.valueOf(a);
                operation.setText(input);
             }
         });
         one.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 1;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         two.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 2;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         three.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 3;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         four.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 4;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         five.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 5;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         six.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 6;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         seven.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 7;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         eight.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 8;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         nine.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int a = 9;
                 input = input +String.valueOf(a);
                 operation.setText(input);
             }
         });
         reset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 input = "";
                 operation.setText(input);
                 result.setText(input);
             }
         });
         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 input.substring(0,input.length()-1);
                 operation.setText(input);
             }
         });
         multiplication.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String a = "*";
                 input = input + a;
                 operation.setText(input);
             }
         });
         division.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String a = "/";
                 input = input + a;
                 operation.setText(input);
             }
         });
         addition.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String a = "+";
                 input = input + a;
                 operation.setText(input);
             }
         });
        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = "-";
                input = input + a;
                operation.setText(input);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.contains("+")){
                    int a = Integer.valueOf(input.split("\\+")[0]);
                    int b = Integer.valueOf(input.split("\\+")[1]);
                    input = String.valueOf(a+b);
                }else if(input.contains("*")){
                    int a = Integer.valueOf(input.split("\\*")[0]);
                    int b = Integer.valueOf(input.split("\\*")[1]);
                    input = String.valueOf(a*b);
                }else if(input.contains("/")){
                    int a = Integer.valueOf(input.split("\\/")[0]);
                    int b = Integer.valueOf(input.split("\\/")[1]);
                    input = String.valueOf(a/b);
                } else if(input.contains("-")){
                    int a = Integer.valueOf(input.split("\\-")[0]);
                    int b = Integer.valueOf(input.split("\\-")[1]);
                    input = String.valueOf(a-b);
                }
                result.setText(input);

            }
        });
    }
}