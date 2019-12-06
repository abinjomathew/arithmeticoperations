package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Multiplication extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String s1,s2;
    float h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);
        e1=(EditText)findViewById(R.id.text1);
        e2=(EditText)findViewById(R.id.text2);
        b1=(Button)findViewById(R.id.addbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                float a=Float.parseFloat(s1);
                float b=Float.parseFloat(s2);
                h=a*b;
                String s=Float.toString(h);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();

            }
        });
    }
}
