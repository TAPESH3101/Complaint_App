package com.example.onlinecomplaintapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PostCoplaintPage extends AppCompatActivity {
    EditText pcname, pcaddress, landmark, pincode, city, complaint,state;
    Button report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_coplaint_page);
        pcname = findViewById(R.id.pcname);
        pcaddress = findViewById(R.id.pcadd);
        landmark = findViewById(R.id.landmark);
        pincode = findViewById(R.id.pincode);
        city = findViewById(R.id.city);

        // comment zero


        state = findViewById(R.id.pcstate);
        complaint = findViewById(R.id.complaint);
        report = findViewById(R.id.report);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PostCoplaintPage.this, "Complaint Registered Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}