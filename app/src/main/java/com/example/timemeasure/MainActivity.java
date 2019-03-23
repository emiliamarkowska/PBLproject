package com.example.timemeasure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      TextView questionTextView;
      final EditText answerEditText;
      Button nextButton;

      final String [] answers= new String[5];

      questionTextView = findViewById(R.id.AgeQuestionTextView);
      answerEditText = findViewById(R.id.AgeQuestionEditText);
      nextButton = findViewById(R.id.NextButton);

      nextButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
                answers[0] = answerEditText.getText().toString();
          }
      });




    }
}
