package com.example.ibooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        android.widget.Toast.makeText(getApplicationContext(),"Welcome to iBooking", android.widget.Toast.LENGTH_SHORT).show();

        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button1);
        btn3=findViewById(R.id.button2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.button:{
                intent=new Intent(getApplicationContext(),GalleActivity.class);
                break;
            }
            case R.id.button1:{
                intent=new Intent(getApplicationContext(),MataraActivity.class);
                break;
            }
            case R.id.button2:{
                intent=new Intent(getApplicationContext(),HambanActivity.class);
                break;
            }
        }
        assert intent != null;
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
