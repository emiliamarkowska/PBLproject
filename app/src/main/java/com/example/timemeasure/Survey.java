package com.example.timemeasure;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Survey extends AppCompatActivity {

    private String [] answers= new String[5];

    private String Questions [] = {
            "How old are you?",
            "What is your employment status?",
            "How much time do you send at work/school/etc per week?",
            "How much time do you spend on your hobby per week? ",
            "How much time do you spend on traveling per week?"
    };

    private String AnswersEmployment [] = {
            "studying", "employed", "unemployed"
    };

    private void ageQuestion()
    {
        setContentView(R.layout.text_answer_question);

        TextView questionTextView;
        final EditText answerEditText;
        Button nextButton;

        questionTextView = findViewById(R.id.AgeQuestionTextView);
        questionTextView.setText(Questions[0]);
        answerEditText = findViewById(R.id.AgeQuestionEditText);
        nextButton = findViewById(R.id.NextButton);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answers[0] = answerEditText.getText().toString();
            }
        });
    }

    private void employmentQuestion()
    {
        setContentView(R.layout.spinner_answer_question);

        TextView questionTextView;
        final Spinner answerEditText;
        Button nextButton;

        questionTextView = findViewById(R.id.QuestionSpinner);
        answerEditText = findViewById(R.id.Spinner);
        nextButton = findViewById(R.id.NextButton);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    answers[1] = answerEditText.get().toString();
            }
        });


    }

    private void workingTimeQuestion()
    {



    }

    private void hobbyTimeQuestion()
    {}

    private void travellingTimeQueston()
    {}





    public void startSurvey()
    {
        int i = 0;
        int questionNumber = 5;

        while(i<questionNumber)
        {
            switch (i) {
                case 0:
                    ageQuestion();
                    break;
                case 1:
                    employmentQuestion();
                    break;
                case 2:
                    workingTimeQuestion();
                    break;
                case 3:
                    hobbyTimeQuestion();
                    break;
                case 4:
                    travellingTimeQueston();
                    break;
            }
            i++;
        }
    }



}
