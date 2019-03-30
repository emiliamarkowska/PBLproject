package com.example.timemeasure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
public class SurveyActivity extends AppCompatActivity {

/*
    private String[] answers = new String[5];
    private String Questions[] = {
            "How old are you?",
            "What is your employment status?",
            "How much time do you send at work/school/etc per week?",
            "How much time do you spend on your hobby per week? ",
            "How much time do you spend on traveling per week?"
    };
    private int iterator;
    private String AnswersEmployment[] = {
            "studying", "employed", "unemployed"
    };

    private TextView questionTextView;
    private EditText answerEditText;
    private Button nextButton;
*/


    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_activity);

        if(findViewById(R.id.fragment_container)!=null)
        {
            if(savedInstanceState!=null)
            {
                return;
            }

            AnswerQuestionFragment answerQuestionFragment = new AnswerQuestionFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, answerQuestionFragment ,null).commit();


        }



/*        questionTextView = findViewById(R.id.TextQuestionTextView);
        answerEditText = findViewById(R.id.TextAnswerEditText);
        nextButton = findViewById(R.id.TextButton);
        updateQuestion();
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answers[iterator] = answerEditText.getText().toString();
                iterator++;
                updateQuestion();
            }
        });*/



    }
/*        public void updateQuestion()
        {
              questionTextView.setText(Questions[iterator]);
        }

    public String getAnswers(int a) {
        return answers[a];
    }*/
}
