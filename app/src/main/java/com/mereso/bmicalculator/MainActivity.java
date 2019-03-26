package com.mereso.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declare
    EditText height,weight;
    Button buttonSubmit;
    TextView textViewResults;
    TextView bmiStatus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResults = findViewById(R.id.textViewResults);
        bmiStatus = findViewById(R.id.bmiStatus);


    }

    public void Submit(View view) {
        String h = height.getText().toString().trim();
        String w = weight.getText().toString().trim();
        if (h.isEmpty()||w.isEmpty())
            return;

        double a = Double.parseDouble(h);
        double b = Double.parseDouble(w);

        double results=b/(a*a);
        textViewResults.setText("BMI is "+ results);
        if (results<15)
        {
            bmiStatus.setText("Very severely underweight");
        }
        else if (results >= 15 && results<16)
        {
            bmiStatus.setText("severely undrweight");
        }
        else if (results >= 16 && results<18.5)
        {
            bmiStatus.setText(" undrweight");
        }
        else if (results >= 18.5 && results<25)
        {
            bmiStatus.setText("Normal");
        }
        else if (results >= 25 && results<30)
        {
            bmiStatus.setText("Overweight");
        }
        else if (results >= 30 && results<35)
        {
            bmiStatus.setText("Obese Class I");
        }
        else if (results >= 35 && results<40)
        {
            bmiStatus.setText("Obese class II");
        }
        else if (results >= 40 && results<45)
        {
            bmiStatus.setText("obese  class III");
        }
        else if (results >= 45 && results<50)
        {
            bmiStatus.setText("obese class IV");
        }
        else if (results >= 50 && results<60)
        {
            bmiStatus.setText("obese class V");
        }
        else if (results>60)
        {
            bmiStatus.setText("obese class VI");
        }
    }
}
