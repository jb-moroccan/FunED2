package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.funed.QuestionDirectory.category;

/**
 * Created by Jenna on 6/24/2017.
 */

public class QuestionPage extends AppCompatActivity {

    private Button backButton;

    private static int ENGLISH = 1;
    private static int MATH = 2;
    private static int HISTORY = 3;
    private static int TECH = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);

        //Get what type of category it is. Generate random int # based on category: history 1-3, eng 4-6, tech 7-9, math 10-12.
        //Get question from realm that corresponds to the id number of the question based on random num.
        // Place category in text view, question in text view, and answer choices in
        // When user clicks button, checks to see if answer is correct. If answer is, add to correct counter, if not add to incorrect counter.
        //Disable button so they cant retry question but renable when activity starts again(if time, add function that sets question to answered and if answered, gives new question instead)

        if (category == ENGLISH)


       /* if(grade == 6)
        {

        }
        else if (grade==7)
        {

        }
        else if (grade == 8)
        {

        }


*/



        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(QuestionPage.this, QuestionDirectory.class);
                startActivity(intent);
            }
        });
    }
}
