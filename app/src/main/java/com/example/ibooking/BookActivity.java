package com.example.ibooking;

import static com.example.ibooking.R.id.nofppl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class BookActivity extends AppCompatActivity {
    DBHelper DB;

    Button btn1;
//    EditText fname,ltname,email,date,tp,addres,nr,np;
    
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        btn1 = (Button) findViewById(R.id.button);
//        fname = (EditText) findViewById(R.id.fname);
//        ltname = (EditText) findViewById(R.id.lName);
//        email = (EditText) findViewById(R.id.email);
//        date = (EditText) findViewById(R.id.date);
//        tp = (EditText) findViewById(R.id.Tp);
//        addres = (EditText) findViewById(R.id.addrs);
//        nr = (EditText) findViewById(R.id.rooms);
//        np = (EditText) findViewById(nofppl);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookActivity.this, "Booked Successfully", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(getApplicationContext(),loginActivity.class);
                startActivity(intent);
            }
        });
    }


    }
