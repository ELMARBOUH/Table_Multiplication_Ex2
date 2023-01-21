package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Activity_Home extends AppCompatActivity {
    EditText et_Number;
    Button btn_reinitialiser , btn_Afficher , btn_quitter ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        et_Number = findViewById(R.id.et_Number);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiser);
        btn_quitter = findViewById(R.id.btn_quitter);


        btn_reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_Number.setText("");
            }

        });


        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }

}