package com.example.timemeasure;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerQuestionFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private TextView questionTextView;
    private Button nextbutton;
    private Spinner spinnerAnswer;
    private String answerMessage;

    AnswerQuestionFragment.OnMessageSendListener messageSendListener;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        answerMessage = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnMessageSendListener
    {


        public void OnMessageSend(String message);
    }

    public SpinnerQuestionFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spinner_question, container, false);

        questionTextView = view.findViewById(R.id.SpinnerQuestionText);
        nextbutton = view.findViewById(R.id.SpinnerNextButton);
        spinnerAnswer = view.findViewById(R.id.SpinnerSpinner);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.emploment_spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnswer.setAdapter(adapter);
        spinnerAnswer.setOnItemSelectedListener(this);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageSendListener.OnMessageSend(answerMessage);
            }
        });


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;


        try
        {
            messageSendListener = (AnswerQuestionFragment.OnMessageSendListener) activity;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString() + " must implement onMessageString");
        }

    }

}
