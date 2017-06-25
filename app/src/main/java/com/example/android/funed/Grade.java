package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Jenna on 6/24/2017.
 */

public class Grade extends AppCompatActivity {

    private Button nextButton;
    private RadioButton grade6;
    private RadioButton grade7;
    private RadioButton grade8;
    private RadioGroup radioGroup;
    public static int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        nextButton = (Button) findViewById(R.id.next);

        grade6 = (RadioButton) findViewById(R.id.grade6);
        grade7 = (RadioButton) findViewById(R.id.grade7);
        grade8 = (RadioButton) findViewById(R.id.grade8);

        radioGroup = (RadioGroup) findViewById(R.id.grades);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                RadioButton rb = (RadioButton)findViewById(checkedId);
                if(rb.getText().equals("Grade 6"))
                {
                    grade = 6;
                }
                else if (rb.getText().equals("Grade 7"))
                {
                    grade = 7;
                }
                else if (rb.getText().equals("Grade 8"))
                {
                    grade = 8;
                }

            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Grade.this, QuestionDirectory.class);
                startActivity(intent);
            }
        });
    }


}
