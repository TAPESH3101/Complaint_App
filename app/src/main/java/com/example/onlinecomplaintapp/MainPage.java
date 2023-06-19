package com.example.onlinecomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
    Button postcomplaint, admininfo, myprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        postcomplaint = findViewById(R.id.btn5);
        admininfo = findViewById(R.id.btn6);
        myprofile = findViewById(R.id.btn7);

        postcomplaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPage.this, PostCoplaintPage.class);
                startActivity(intent);
            }
        });

        admininfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPage.this, AdminProfile.class);
                startActivity(intent);
            }
        });

        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPage.this, MyProfile.class);
                startActivity(intent);
            }
        });
    }
}