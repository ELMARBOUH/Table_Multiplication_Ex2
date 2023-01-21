package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

public class Activity_Home extends AppCompatActivity {
    EditText et_Number;
    Button btn_reinitialiser , btn_Afficher , btn_quitter ,btn_pink , btn_white , btn_purple ;
    View layout ;
    




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        et_Number = findViewById(R.id.et_Number);
        btn_reinitialiser = findViewById(R.id.btn_reinitialiser);
        btn_quitter = findViewById(R.id.btn_quitter);
        btn_pink = findViewById(R.id.btn_pink);
        btn_white = findViewById(R.id.btn_white);
        btn_purple = findViewById(R.id.btn_purple);
        layout = findViewById(R.id.layout);


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


        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    layout.setBackgroundColor(Color.parseColor("#E5BEBE"));
            }
        });

        btn_purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.parseColor("#E3ACF9"));
            }
        });

        btn_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            }
        });








    }

}