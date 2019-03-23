package com.example.timemeasure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button mainButton;
        final TextView randomText;
        randomText = findViewById(R.id.twojastara);
        mainButton = findViewById(R.id.mainButton);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                randomText.setVisibility(View.VISIBLE);

                setContentView(R.layout.text_answer_question);

            }
        });













    }
}
