package com.example.latihan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_alas);
        final EditText tinggi = (EditText)findViewById(R.id.input_tinggi);
        final TextView luas = (TextView)findViewById(R.id.output_luas);

        final Button hitung = (Button)findViewById(R.id.btn_hitung);
        
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String isialas = alas.getText().toString();
                String isitinggi = tinggi.getText().toString();
                double a = Double.parseDouble(isialas);
                double t = Double.parseDouble(isitinggi);
                double l = a*t/2;
                String output = String.valueOf(l);
                luas.setText(output.toString());
            }
        });
    }
}