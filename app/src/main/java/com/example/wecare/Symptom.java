package com.example.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Symptom extends AppCompatActivity {
    Button bt1;
    EditText sym1;
    EditText sym2;
    EditText sym3;
    EditText sym4;
    EditText sym5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom);
        bt1=(Button)findViewById(R.id.next1);
        sym1=(EditText)findViewById(R.id.symp1);
        sym2=(EditText)findViewById(R.id.symp2);
        sym3=(EditText)findViewById(R.id.symp3);
        sym4=(EditText)findViewById(R.id.symp4);
        sym5=(EditText)findViewById(R.id.symp5);

    }
    public void getresult(View view){

            Intent intent1 = new Intent(Symptom.this, Result.class);
            startActivity(intent1);

    }
}
