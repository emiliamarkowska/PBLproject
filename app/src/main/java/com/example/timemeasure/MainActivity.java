package com.example.timemeasure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private DataBaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        dbHelper = new DataBaseHelper(this, MainActivity.this);
        Button statsButton;
        statsButton = findViewById(R.id.showStats);

        if(isDatabaseEmpty())
        {
            if(getIntent().getStringArrayExtra("Answers") != null)
            {
                User user = new User(getIntent().getStringArrayExtra("Answers"));
                dbHelper.addInformationAboutUser(user);
            }
            else
                {
                    Intent intent = new Intent(this, SurveyActivity.class);
                    startActivityForResult(intent,0);
                }
        }

        Intent intent = new Intent(this, SurveyActivity.class);
        startActivityForResult(intent,0);


    }
    public DataBaseHelper getDbHelper()
    {
        return this.dbHelper;
    }

    public boolean isDatabaseEmpty()
    {
        return dbHelper.isEmpty();
    }

}
