package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // importing all
    public EditText num1, num2;
    public Button add, subtract;
    public TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editTextNumber1);
        num2 = (EditText)findViewById(R.id.editTextNumber2);
        add = (Button)findViewById(R.id.add);
        result = (TextView)findViewById(R.id.result);

    }

        public void errorTrap () {
            if (num1.length() == 0 || num2.length() == 0) {
                add.setEnabled(false);
                subtract.setEnabled(false);
            }
        }


    public void addNumbers (View view) {
        /*double number1 = Double.parseDouble(num1.getText().toString());
          double number2 = Double.parseDouble(num2.getText().toString());
          double sum = number1 + number2
       */
        errorTrap();
        double sum = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num1.getText().toString());
        result.setText("SUM: "+sum);
    }

    public void subtractNumbers (View view) {
        /*double number1 = Double.parseDouble(num1.getText().toString());
        double number2 = Double.parseDouble(num2.getText().toString());
        double difference = number1 + number2;
        */
        errorTrap();
        double difference = Double.parseDouble(num1.getText().toString()) + Double.parseDouble(num1.getText().toString());
        result.setText("DIFFERENCE: "+difference);
    }

}