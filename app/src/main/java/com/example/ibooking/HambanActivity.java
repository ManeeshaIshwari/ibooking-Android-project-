package com.example.ibooking;

import static com.example.ibooking.R.id.button1;
import static com.example.ibooking.R.id.button2;
import static com.example.ibooking.R.id.button3;
import static com.example.ibooking.R.id.button4;
import static com.example.ibooking.R.id.button5;
import static com.example.ibooking.R.id.button6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HambanActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamban);

        btn1=findViewById(button1);
        btn2=findViewById(button2);
        btn3=findViewById(button3);
        btn4=findViewById(button4);
        btn5=findViewById(button5);
        btn6=findViewById(button6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case button1:{
                intent=new Intent(getApplicationContext(),ShrangilaActivity.class);
                break;
            }
            case button2:{
                intent=new Intent(getApplicationContext(),BirdresortActivity.class);
                break;
            }
            case button3:{
                intent=new Intent(getApplicationContext(),OasisActivity.class);
                break;
            }
            case button4:{
                intent=new Intent(getApplicationContext(),JadeActivity.class);
                break;
            }
            case button5:{
                intent=new Intent(getApplicationContext(),LadjaActivity.class);
                break;
            }
            case button6:{
                intent=new Intent(getApplicationContext(),CamelliaActivity.class);
                break;
            }
        }
        assert intent != null;
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}