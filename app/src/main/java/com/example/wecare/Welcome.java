package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
    Button bt;
    EditText nm;
    EditText ag;
    EditText gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        bt=findViewById(R.id.next);
        nm=(EditText)findViewById(R.id.name);
        ag=(EditText)findViewById(R.id.age);
        gen=(EditText)findViewById(R.id.gender);
    }


    public void  movetolog(View view) {

        if((gen.getText().toString().isEmpty()) || (nm.getText().toString().isEmpty()) || ag.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Fill All Details", Toast.LENGTH_SHORT).show();
        }

        else {
            Intent intent1 = new Intent(Welcome.this, Symptom.class);
            startActivity(intent1);
        }

    }
}
