package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName3;
    EditText editTextTextPersonName4;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        textView5 = findViewById(R.id.textView5);
    }
    // Define onClick actions
    public void sum(View view){
        if(editTextTextPersonName3.getText().toString().matches("") || editTextTextPersonName4.getText().toString().matches("")){
            textView5.setText("Enter Number!");
        }else{
            int myNumber1 = Integer.parseInt(editTextTextPersonName3.getText().toString());
            int myNumber2 = Integer.parseInt(editTextTextPersonName4.getText().toString());
            int result = myNumber1 + myNumber2;
            textView5.setText("Result: " + result);
        }
    }
    public void deduct(View view){
        if(editTextTextPersonName3.getText().toString().matches("") || editTextTextPersonName4.getText().toString().matches("")){
            textView5.setText("Enter Number!");
        }else{
            int myNumber1 = Integer.parseInt(editTextTextPersonName3.getText().toString());
            int myNumber2 = Integer.parseInt(editTextTextPersonName4.getText().toString());
            int result = myNumber1 - myNumber2;
            textView5.setText("Result: " + result);
        }
    }
    public void multiply(View view){
        if(editTextTextPersonName3.getText().toString().matches("") || editTextTextPersonName4.getText().toString().matches("")){
            textView5.setText("Enter Number!");
        }else{
            int myNumber1 = Integer.parseInt(editTextTextPersonName3.getText().toString());
            int myNumber2 = Integer.parseInt(editTextTextPersonName4.getText().toString());
            int result = myNumber1 * myNumber2;
            textView5.setText("Result: " +       result);
        }
    }
    public void divide(View view){
        if(editTextTextPersonName3.getText().toString().matches("") || editTextTextPersonName4.getText().toString().matches("")){
            textView5.setText("Enter Number!");
        }else{
            double myNumber1 = Double.parseDouble(editTextTextPersonName3.getText().toString());
            double myNumber2 = Double.parseDouble(editTextTextPersonName4.getText().toString());
            double result = myNumber1 / myNumber2;
            textView5.setText("Result: " + result);
        }
    }
}