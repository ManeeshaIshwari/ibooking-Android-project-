package com.example.ibooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.ibooking.R.id.button1;

public class GrennCasaActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grenn_casa);


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