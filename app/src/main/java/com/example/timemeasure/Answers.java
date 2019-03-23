package com.example.timemeasure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Answers extends AppCompatActivity {

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;
    private TextView answer5;

    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answers);
        answer1 = findViewById(R.id.editText);
        answer2 = findViewById(R.id.editText2);
        answer3 = findViewById(R.id.editText3);
        answer4 = findViewById(R.id.editText4);
        answer5 = findViewById(R.id.editText5);

        Survey survey = new Survey();

        answer1.setText("5");
        answer2.setText("23");
        answer3.setText("32434");
        answer4.setText("asdasd");
        answer5.setText("lubie");
    }
}
