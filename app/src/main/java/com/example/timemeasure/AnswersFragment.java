package com.example.timemeasure;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AnswersFragment extends Fragment {


    public AnswersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_answers, container, false);

        TextView textView [] = new TextView[5];
        textView[0] = view.findViewById(R.id.textView);
        textView[1] = view.findViewById(R.id.textView2);
        textView[2] = view.findViewById(R.id.textView3);
        textView[3] = view.findViewById(R.id.textView4);
        textView[4] = view.findViewById(R.id.textView5);

        Bundle bundle = getArguments();
        String [] answers = bundle.getStringArray("answers");

        textView[0].setText(answers[0]);
        textView[1].setText(answers[1]);
        textView[2].setText(answers[2]);
        textView[3].setText(answers[3]);
        textView[4].setText(answers[4]);
        return view;
    }

}
