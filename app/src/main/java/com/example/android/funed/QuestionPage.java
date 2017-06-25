package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import io.realm.Realm;

import static com.example.android.funed.QuestionDirectory.category;

/**
 * Created by Jenna on 6/24/2017.
 */

public class QuestionPage extends AppCompatActivity {

    private Button backButton;
    private Button submitButton;

    private RadioButton ac1;
    private RadioButton ac2;
    private RadioButton ac3;
    private RadioButton ac4;

    private TextView categoryView;
    private static int ENGLISH = 1;
    private static int MATH = 2;
    private static int HISTORY = 3;
    private static int TECH = 4;
    private int idNumQ;
    private String questionAnswer;

    public static int numCorrect;
    public static int numIncorrect;
    Realm realm;
    Question questionAsking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        TextView numCorrectTxt = (TextView) findViewById(R.id.numCorrect);
        numCorrectTxt.setText("Number Correct: " + numCorrect);
        TextView numIncorrectTxt = (TextView) findViewById(R.id.numIncorrect);
        numIncorrectTxt.setText("Number Incorrect: " + numIncorrect);

        //Get what type of category it is. Generate random int # based on category: history 1-3, eng 4-6, tech 7-9, math 10-12.
        //Get question from realm that corresponds to the id number of the question based on random num.
        // Place category in text view, question in text view, and answer choices in
        // When user clicks button, checks to see if answer is correct. If answer is, add to correct counter, if not add to incorrect counter.
        //Disable button so they cant retry question but renable when activity starts again(if time, add function that sets question to answered and if answered, gives new question instead)

        realm = Realm.getDefaultInstance();

        realm.init(this);
        TextView categoryTxt = (TextView) findViewById(R.id.categoryName);
        if (category == HISTORY)
        {
            //Num 1-3
            idNumQ = (1 + (int)(Math.random() * ((3 - 1) + 1)));
            categoryTxt.setText(R.string.categoryHist);
        }
        else if (category == ENGLISH)
        {
            //Num 4-6
            idNumQ = (4 + (int)(Math.random() * ((6 - 4) + 1)));
            categoryTxt.setText(R.string.categoryEng);
        }
        else if (category == TECH)
        {
            //Num 7-9
            idNumQ = (7 + (int)(Math.random() * ((9 - 7) + 1)));
            categoryTxt.setText(R.string.categoryTech);
        }
        else if (category == MATH)
        {
            //Num 10-12
            idNumQ = (10 + (int)(Math.random() * ((12 - 10) + 1)));
            categoryTxt.setText(R.string.categoryMath);
        }
        try
        {
            questionAsking = realm.where(Question.class).equalTo("id", idNumQ).findFirst();

            TextView questionTxt = (TextView) findViewById(R.id.Question);
            questionTxt.setText(questionAsking.getQuestion());

            RadioButton answerOneHist = (RadioButton) findViewById(R.id.choice1);
            answerOneHist.setText(questionAsking.getAnswerChoice1());

            RadioButton answerTwoHist = (RadioButton) findViewById(R.id.choice2);
            answerTwoHist.setText(questionAsking.getAnswerChoice2());

            RadioButton answerThreeHist = (RadioButton) findViewById(R.id.choice3);
            answerThreeHist.setText(questionAsking.getAnswerChoice3());

            RadioButton answerFourHist = (RadioButton) findViewById(R.id.choice4);
            answerFourHist.setText(questionAsking.getAnswerChoice4());

            TextView difficultyTxt = (TextView) findViewById(R.id.difficulty);
            difficultyTxt.setText("Difficulty: " + questionAsking.getDifficultyLevel());

            questionAnswer = questionAsking.getAnswer();

        } finally {
            realm.close();
        }

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ac1 = (RadioButton) findViewById(R.id.choice1);
                ac2 = (RadioButton) findViewById(R.id.choice2);
                ac3 = (RadioButton) findViewById(R.id.choice3);
                ac4 = (RadioButton) findViewById(R.id.choice4);

                if (ac1.isChecked()==true)
                {
                    if(ac1.getText().equals(questionAnswer))
                    {
                        Toast.makeText(QuestionPage.this, "Correct!", Toast.LENGTH_SHORT).show();
                        numCorrect++;
                        TextView numCorrectTxt = (TextView) findViewById(R.id.numCorrect);
                        numCorrectTxt.setText("Number Correct: " + numCorrect);
                    }
                    else
                    {
                        Toast.makeText(QuestionPage.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                        numIncorrect++;
                        TextView numIncorrectTxt = (TextView) findViewById(R.id.numIncorrect);
                        numIncorrectTxt.setText("Number Incorrect: " + numIncorrect);
                    }
                }
                else if (ac2.isChecked()==true)
                {
                    if(ac2.getText().equals(questionAnswer))
                    {
                        Toast.makeText(QuestionPage.this, "Correct!", Toast.LENGTH_SHORT).show();
                        numCorrect++;
                        TextView numCorrectTxt = (TextView) findViewById(R.id.numCorrect);
                        numCorrectTxt.setText("Number Correct: " + numCorrect);
                    }
                    else
                    {
                        Toast.makeText(QuestionPage.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                        numIncorrect++;
                        TextView numIncorrectTxt = (TextView) findViewById(R.id.numIncorrect);
                        numIncorrectTxt.setText("Number Incorrect: " + numIncorrect);
                    }
                }
                else if (ac3.isChecked()==true)
                {
                    if(ac3.getText().equals(questionAnswer))
                    {
                        Toast.makeText(QuestionPage.this, "Correct!", Toast.LENGTH_SHORT).show();
                        numCorrect++;
                        TextView numCorrectTxt = (TextView) findViewById(R.id.numCorrect);
                        numCorrectTxt.setText("Number Correct: " + numCorrect);
                    }
                    else
                    {
                        Toast.makeText(QuestionPage.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                        numIncorrect++;
                        TextView numIncorrectTxt = (TextView) findViewById(R.id.numIncorrect);
                        numIncorrectTxt.setText("Number Incorrect: " + numIncorrect);
                    }
                }
                else if (ac4.isChecked()==true)
                {
                    if(ac4.getText().equals(questionAnswer))
                    {
                        Toast.makeText(QuestionPage.this, "Correct!", Toast.LENGTH_SHORT).show();
                        numCorrect++;
                        TextView numCorrectTxt = (TextView) findViewById(R.id.numCorrect);
                        numCorrectTxt.setText("Number Correct: " + numCorrect);
                    }
                    else
                    {
                        Toast.makeText(QuestionPage.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                        numIncorrect++;
                        TextView numIncorrectTxt = (TextView) findViewById(R.id.numIncorrect);
                        numIncorrectTxt.setText("Number Incorrect: " + numIncorrect);
                    }
                }
                else
                {
                    Toast.makeText(QuestionPage.this, "No answer selected. Please Try Again.", Toast.LENGTH_LONG).show();
                }


            }
        });

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
