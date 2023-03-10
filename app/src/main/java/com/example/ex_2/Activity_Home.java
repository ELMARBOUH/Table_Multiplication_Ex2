package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout;
import android.widget.Switch;



import java.util.Objects;

public class Activity_Home extends AppCompatActivity {
    EditText et_Number;
    Button btn_reinitialiser , btn_Afficher , btn_quitter ,btn_pink , btn_white , btn_purple ;
    View layout ;
    TextView txt_result ;





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

        Objects.requireNonNull(getSupportActionBar()).setTitle("Table Multiplication");



        btn_reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_Number.setText("");
                txt_result.setText(R.string.multiplication);


            }

        });


        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });




        btn_Afficher.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                int txt_Value = Integer.parseInt(et_Number.getText().toString());
                String trimmed = et_Number.getText().toString();

                if (!(trimmed.trim().equals(""))) {
                    StringBuilder p_result = new StringBuilder();

                    for (int i = 1; i <= 10; i++) {
                        int result = txt_Value * i;
                        p_result.append(String.format(" %d*%d=%d \n", txt_Value, i, result));

                    }
                    txt_result.setText(p_result);
                }else{
                    Toast.makeText(Activity_Home.this, "veuillez saisir un entier !!", Toast.LENGTH_SHORT).show();
                    txt_result.setText(R.string.multiplication);

                }

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