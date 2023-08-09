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

public class AmariHotelActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amari_hotel);

        btn1=findViewById(button1);

        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case button1:{
                intent=new Intent(getApplicationContext(),BookActivity.class);
                break;
            }

        }
        assert intent != null;
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
}