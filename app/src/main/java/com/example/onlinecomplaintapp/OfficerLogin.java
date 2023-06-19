package com.example.onlinecomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OfficerLogin extends AppCompatActivity {

    private EditText pass, userid;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_login);
        pass = (EditText) findViewById(R.id.pass);
        userid = (EditText) findViewById(R.id.userid);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append("Login Successfull");
                Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OfficerLogin.this, MainPage.class);
                startActivity(intent);
            }
        });
    }
}