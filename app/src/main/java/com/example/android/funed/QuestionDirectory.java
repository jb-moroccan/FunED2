package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jenna on 6/24/2017.
 */

public class QuestionDirectory extends AppCompatActivity {

    private Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_directory);
        goButton = (Button) findViewById(R.id.go);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(QuestionDirectory.this, QuestionPage.class);
                startActivity(intent);
            }
        });
    }


}
