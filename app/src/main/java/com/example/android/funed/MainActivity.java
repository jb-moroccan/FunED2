package com.example.android.funed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;
import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    private static int ENGLISH = 1;
    private static int MATH = 2;
    private static int HISTORY = 3;
    private static int TECH = 4;

    Realm realm;

    private RealmList<Question> allQuestions = new RealmList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Grade.class);
                    startActivity(intent);
            }
        });
    }

    public void addNewQuestions()
    {
        final Question historyQ1 = new Question();
        historyQ1.setQuestion("");
        historyQ1.setAnswer("");
        historyQ1.setAnswerChoice1("");
        historyQ1.setAnswerChoice2("");
        historyQ1.setAnswerChoice3("");
        historyQ1.setAnswerChoice4("");
        historyQ1.setQuestionCategory("use the constants");
        historyQ1.setGradeLevel(6);
        allQuestions.add(historyQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ1);
        realm.commitTransaction();

        final Question historyQ2 = new Question();
        historyQ2.setQuestion("");
        historyQ2.setAnswer("");
        historyQ2.setAnswerChoice1("");
        historyQ2.setAnswerChoice2("");
        historyQ2.setAnswerChoice3("");
        historyQ2.setAnswerChoice4("");
        historyQ2.setQuestionCategory("use the constants");
        historyQ2.setGradeLevel(7);
        allQuestions.add(historyQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ2);
        realm.commitTransaction();

        final Question historyQ3 = new Question();
        historyQ3.setQuestion("");
        historyQ3.setAnswer("");
        historyQ3.setAnswerChoice1("");
        historyQ3.setAnswerChoice2("");
        historyQ3.setAnswerChoice3("");
        historyQ3.setAnswerChoice4("");
        historyQ3.setQuestionCategory("use the constants");
        historyQ3.setGradeLevel(8);
        allQuestions.add(historyQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ3);
        realm.commitTransaction();

        final Question englishQ1 = new Question();
        englishQ1.setQuestion("");
        englishQ1.setAnswer("");
        englishQ1.setAnswerChoice1("");
        englishQ1.setAnswerChoice2("");
        englishQ1.setAnswerChoice3("");
        englishQ1.setAnswerChoice4("");
        englishQ1.setQuestionCategory("use the constants");
        englishQ1.setGradeLevel("use number");
        allQuestions.add(englishQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ1);
        realm.commitTransaction();

        final Question englishQ2 = new Question();
        englishQ2.setQuestion("");
        englishQ2.setAnswer("");
        englishQ2.setAnswerChoice1("");
        englishQ2.setAnswerChoice2("");
        englishQ2.setAnswerChoice3("");
        englishQ2.setAnswerChoice4("");
        englishQ2.setQuestionCategory("use the constants");
        englishQ2.setGradeLevel("use number");
        allQuestions.add(englishQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ2);
        realm.commitTransaction();

        final Question englishQ3 = new Question();
        englishQ3.setQuestion("");
        englishQ3.setAnswer("");
        englishQ3.setAnswerChoice1("");
        englishQ3.setAnswerChoice2("");
        englishQ3.setAnswerChoice3("");
        englishQ3.setAnswerChoice4("");
        englishQ3.setQuestionCategory("use the constants");
        englishQ3.setGradeLevel("use number");
        allQuestions.add(englishQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ3);
        realm.commitTransaction();

        final Question techQ1 = new Question();
        techQ1.setQuestion("");
        techQ1.setAnswer("");
        techQ1.setAnswerChoice1("");
        techQ1.setAnswerChoice2("");
        techQ1.setAnswerChoice3("");
        techQ1.setAnswerChoice4("");
        techQ1.setQuestionCategory("use the constants");
        techQ1.setGradeLevel("use number");
        allQuestions.add(techQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ1);
        realm.commitTransaction();

        final Question techQ2 = new Question();
        techQ2.setQuestion("");
        techQ2.setAnswer("");
        techQ2.setAnswerChoice1("");
        techQ2.setAnswerChoice2("");
        techQ2.setAnswerChoice3("");
        techQ2.setAnswerChoice4("");
        techQ2.setQuestionCategory("use the constants");
        techQ2.setGradeLevel("use number");
        allQuestions.add(techQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ2);
        realm.commitTransaction();

        final Question techQ3 = new Question();
        techQ3.setQuestion("");
        techQ3.setAnswer("");
        techQ3.setAnswerChoice1("");
        techQ3.setAnswerChoice2("");
        techQ3.setAnswerChoice3("");
        techQ3.setAnswerChoice4("");
        techQ3.setQuestionCategory("use the constants");
        techQ3.setGradeLevel("use number");
        allQuestions.add(techQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ3);
        realm.commitTransaction();

        final Question mathQ1 = new Question();
        mathQ1.setQuestion("");
        mathQ1.setAnswer("");
        mathQ1.setAnswerChoice1("");
        mathQ1.setAnswerChoice2("");
        mathQ1.setAnswerChoice3("");
        mathQ1.setAnswerChoice4("");
        mathQ1.setQuestionCategory("use the constants");
        mathQ1.setGradeLevel("use number");
        allQuestions.add(mathQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ1);
        realm.commitTransaction();

        final Question mathQ2 = new Question();
        mathQ2.setQuestion("");
        mathQ2.setAnswer("");
        mathQ2.setAnswerChoice1("");
        mathQ2.setAnswerChoice2("");
        mathQ2.setAnswerChoice3("");
        mathQ2.setAnswerChoice4("");
        mathQ2.setQuestionCategory("use the constants");
        mathQ2.setGradeLevel("use number");
        allQuestions.add(mathQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ2);
        realm.commitTransaction();

        final Question mathQ3 = new Question();
        mathQ3.setQuestion("");
        mathQ3.setAnswer("");
        mathQ3.setAnswerChoice1("");
        mathQ3.setAnswerChoice2("");
        mathQ3.setAnswerChoice3("");
        mathQ3.setAnswerChoice4("");
        mathQ3.setQuestionCategory("use the constants");
        mathQ3.setGradeLevel("use number");
        allQuestions.add(mathQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ3);
        realm.commitTransaction();
    }

}
