package com.example.timemeasure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SurveyActivity extends AppCompatActivity implements AnswerQuestionFragment.OnMessageSendListener {
    private int iterator = 0;
    String answers[] = new String[5];
    private DataBaseHelper dbHelper;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_activity);
        intent = new Intent(this, MainActivity.class);

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }
            AnswerQuestionFragment answerQuestionFragment = new AnswerQuestionFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("iterator", iterator);
            answerQuestionFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, answerQuestionFragment, null).commit();
        }
    }

    @Override
    public void OnMessageSend(String message) {

        answers[iterator] = message;
        iterator++;

        switch (iterator) {
            case 1:
                SpinnerQuestionFragment spinnerQuestionFragment = new SpinnerQuestionFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("iterator", iterator);
                spinnerQuestionFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, spinnerQuestionFragment, null);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case 2:
                AnswerQuestionFragment answerQuestionFragment = new AnswerQuestionFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("iterator", iterator);
                answerQuestionFragment.setArguments(bundle2);
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, answerQuestionFragment, null);
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();
                break;
            case 3:
                AnswerQuestionFragment answerQuestionFragment3 = new AnswerQuestionFragment();
                Bundle bundle3 = new Bundle();
                bundle3.putInt("iterator", iterator);
                answerQuestionFragment3.setArguments(bundle3);
                FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, answerQuestionFragment3, null);
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.commit();
                break;
            case 4:
                AnswerQuestionFragment answerQuestionFragment4 = new AnswerQuestionFragment();
                Bundle bundle4 = new Bundle();
                bundle4.putInt("iterator", iterator);
                answerQuestionFragment4.setArguments(bundle4);
                FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, answerQuestionFragment4, null);
                fragmentTransaction4.addToBackStack(null);
                fragmentTransaction4.commit();
                break;
            case 5:
                intent.putExtra("Answers", answers);
                startActivity(intent);
                break;
        }
    }
}
