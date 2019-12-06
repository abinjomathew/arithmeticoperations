package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.subs);
        b3=(Button)findViewById(R.id.divide);
        b4=(Button)findViewById(R.id.multiply);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Addition.class);
                startActivity(intent);
            }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent1=new Intent(getApplicationContext(),Substraction.class);
               startActivity(intent1);

           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2=new Intent(getApplicationContext(),Multiplication.class);
               startActivity(intent2);
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent3=new Intent(getApplicationContext(),Division.class);
               startActivity(intent3);
           }
       });

    }
}
