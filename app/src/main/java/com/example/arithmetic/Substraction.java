package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Substraction extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String s1,s2;
    float h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substraction);
        e1=(EditText)findViewById(R.id.text1);
        e2=(EditText)findViewById(R.id.text2);
        b1=(Button)findViewById(R.id.addbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                float f=Float.parseFloat(s1);
                float g=Float.parseFloat(s2);
                h=f-g;
                String s=Float.toString(h);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
            }
        });
    }
}
