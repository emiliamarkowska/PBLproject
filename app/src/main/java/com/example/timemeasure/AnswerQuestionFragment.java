package com.example.timemeasure;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */

public class AnswerQuestionFragment extends Fragment {


    OnMessageSendListener messageSendListener;
    private EditText answer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_answer_question, container, false);

        TextView questionTextView = view.findViewById(R.id.AnswerQuestionText);
        Button nextbutton = view.findViewById(R.id.AnswerNextButton);
        answer = view.findViewById(R.id.AnswerAnswerText);
        String[] questionArray = getResources().getStringArray(R.array.Questions);

        Bundle bundle = getArguments();
        int numberOfQuestion = bundle.getInt("iterator");

        questionTextView.setText(questionArray[numberOfQuestion]);


        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String answerMessage = answer.getText().toString();
                messageSendListener.OnMessageSend(answerMessage);

            }
        });

        return view;
    }

    public AnswerQuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;


        try {
            messageSendListener = (OnMessageSendListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onMessageString");
        }

    }


    public interface OnMessageSendListener {


        public void OnMessageSend(String message);
    }
}
