package com.example.tehtvko8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numInput;
    private EditText numInput2;
    private TextView numOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInput = findViewById(R.id.firstEditText); // input view
        numInput2 = findViewById(R.id.secondEditText); // input view 2
        numOutput = findViewById(R.id.textView);
    }

    public void CalculatePlus(View view) {
        int numero1 = Integer.parseInt(numInput.getText().toString());
        int numero2 = Integer.parseInt(numInput2.getText().toString());
        int summa = numero1 + numero2;
        numOutput.setText(Integer.toString(summa));
    }


    public void CalculateMinus(View view) {
        int numero1 = Integer.parseInt(numInput.getText().toString());
        int numero2 = Integer.parseInt(numInput2.getText().toString());
        int minus = numero1 - numero2;
        numOutput.setText(Integer.toString(minus));
    }

    public void CalculateMulti(View view) {
        int numero1 = Integer.parseInt(numInput.getText().toString());
        int numero2 = Integer.parseInt(numInput2.getText().toString());
        int multi = numero1 * numero2;
        numOutput.setText(Integer.toString(multi));
    }

    public void CalculateDivision(View view) {
        int numero1 = Integer.parseInt(numInput.getText().toString());
        int numero2 = Integer.parseInt(numInput.getText().toString());
        int division = numero1 / numero2;
        numOutput.setText(Integer.toString(division));

    }
}