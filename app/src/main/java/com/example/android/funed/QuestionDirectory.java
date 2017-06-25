package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jenna on 6/24/2017.
 */

public class QuestionDirectory extends AppCompatActivity {

    private Button goButton;
    private RadioButton math;
    private RadioButton english;
    private RadioButton history;
    private RadioButton technology;
    private RadioGroup radioGroup;
    private static int ENGLISH = 1;
    private static int MATH = 2;
    private static int HISTORY = 3;
    private static int TECH = 4;
    public static int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_directory);

        math = (RadioButton) findViewById(R.id.math);
        english = (RadioButton) findViewById(R.id.english);
        history = (RadioButton) findViewById(R.id.history);
        technology = (RadioButton) findViewById(R.id.technology);

        radioGroup = (RadioGroup) findViewById(R.id.categories);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton)findViewById(checkedId);
                if(rb.getText().equals("English"))
                {
                    category = ENGLISH;
                }
                else if (rb.getText().equals("Math"))
                {
                    category = MATH;
                }
                else if (rb.getText().equals("History/Geography"))
                {
                    category = HISTORY;
                }
                else if (rb.getText().equals("Science/Technology"))
                {
                    category = TECH;
                }
            }
        });

        goButton = (Button) findViewById(R.id.go);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                math = (RadioButton) findViewById(R.id.math);
                english = (RadioButton) findViewById(R.id.english);
                technology = (RadioButton) findViewById(R.id.technology);
                history = (RadioButton) findViewById(R.id.history);

                if(!math.isChecked() && !english.isChecked() && !technology.isChecked() && !history.isChecked())
                {
                    Toast.makeText(QuestionDirectory.this, "No category selected. Please Try Again", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent = new Intent();
                    intent.setClass(QuestionDirectory.this, QuestionPage.class);
                    startActivity(intent);
                }
            }
        });
    }


}
