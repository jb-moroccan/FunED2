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

        realm = Realm.getDefaultInstance();

        Realm.init(this);

        addNewQuestions();
        startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, QuestionDirectory.class);
                    startActivity(intent);
            }
        });

        Button clickHereButton = (Button) findViewById(R.id.clickHereButton);
        clickHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Help.class);
                startActivity(intent);
            }
        });
    }

    public void addNewQuestions() {
        realm.getDefaultInstance();

        Realm.init(this);

        final Question historyQ1 = new Question();
        historyQ1.setId(1);
        historyQ1.setQuestion(getString(R.string.historyq1));
        historyQ1.setAnswer(getString(R.string.historya1));
        historyQ1.setAnswerChoice1(getString(R.string.historychoiceq1a));
        historyQ1.setAnswerChoice2(getString(R.string.historychoiceq1b));
        historyQ1.setAnswerChoice3(getString(R.string.historychoiceq1c));
        historyQ1.setAnswerChoice4(getString(R.string.historychoiceq1d));
        historyQ1.setQuestionCategory(HISTORY);
        historyQ1.setDifficultyLevel("Easy");
        allQuestions.add(historyQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ1);
        realm.commitTransaction();

        final Question historyQ2 = new Question();
        historyQ2.setId(2);
        historyQ2.setQuestion(getString(R.string.historyq2));
        historyQ2.setAnswer(getString(R.string.historya2));
        historyQ2.setAnswerChoice1(getString(R.string.historychoiceq2a));
        historyQ2.setAnswerChoice2(getString(R.string.historychoiceq2b));
        historyQ2.setAnswerChoice3(getString(R.string.historychoiceq2c));
        historyQ2.setAnswerChoice4(getString(R.string.historychoiceq2d));
        historyQ2.setQuestionCategory(HISTORY);
        historyQ2.setDifficultyLevel("Medium");
        allQuestions.add(historyQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ2);
        realm.commitTransaction();

        final Question historyQ3 = new Question();
        historyQ3.setId(3);
        historyQ3.setQuestion(getString(R.string.historyq3));
        historyQ3.setAnswer(getString(R.string.historya3));
        historyQ3.setAnswerChoice1(getString(R.string.historychoiceq3a));
        historyQ3.setAnswerChoice2(getString(R.string.historychoiceq3b));
        historyQ3.setAnswerChoice3(getString(R.string.historychoiceq3c));
        historyQ3.setAnswerChoice4(getString(R.string.historychoiceq3d));
        historyQ3.setQuestionCategory(HISTORY);
        historyQ3.setDifficultyLevel("Hard");
        allQuestions.add(historyQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(historyQ3);
        realm.commitTransaction();

        final Question englishQ1 = new Question();
        englishQ1.setId(4);
        englishQ1.setQuestion(getString(R.string.englishq1));
        englishQ1.setAnswer(getString(R.string.englisha1));
        englishQ1.setAnswerChoice1(getString(R.string.englishchoiceq1a));
        englishQ1.setAnswerChoice2(getString(R.string.englishchoiceq1b));
        englishQ1.setAnswerChoice3(getString(R.string.englishchoiceq1c));
        englishQ1.setAnswerChoice4(getString(R.string.englishchoiceq1d));
        englishQ1.setQuestionCategory(ENGLISH);
        englishQ1.setDifficultyLevel("Easy");
        allQuestions.add(englishQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ1);
        realm.commitTransaction();

        final Question englishQ2 = new Question();
        englishQ2.setId(5);
        englishQ2.setQuestion(getString(R.string.englishq2));
        englishQ2.setAnswer(getString(R.string.englisha2));
        englishQ2.setAnswerChoice1(getString(R.string.englishchoiceq2a));
        englishQ2.setAnswerChoice2(getString(R.string.englishchoiceq2b));
        englishQ2.setAnswerChoice3(getString(R.string.englishchoiceq2c));
        englishQ2.setAnswerChoice4(getString(R.string.englishchoiceq2d));
        englishQ2.setQuestionCategory(ENGLISH);
        englishQ2.setDifficultyLevel("Medium");
        allQuestions.add(englishQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ2);
        realm.commitTransaction();

        final Question englishQ3 = new Question();
        englishQ3.setId(6);
        englishQ3.setQuestion(getString(R.string.englishq3));
        englishQ3.setAnswer(getString(R.string.englisha3));
        englishQ3.setAnswerChoice1(getString(R.string.englishchoiceq3a));
        englishQ3.setAnswerChoice2(getString(R.string.englishchoiceq3b));
        englishQ3.setAnswerChoice3(getString(R.string.englishchoiceq3c));
        englishQ3.setAnswerChoice4(getString(R.string.englishchoiceq3d));
        englishQ3.setQuestionCategory(ENGLISH);
        englishQ3.setDifficultyLevel("Hard");
        allQuestions.add(englishQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(englishQ3);
        realm.commitTransaction();

        final Question techQ1 = new Question();
        techQ1.setId(7);
        techQ1.setQuestion(getString(R.string.scienceq1));
        techQ1.setAnswer(getString(R.string.sciencea1));
        techQ1.setAnswerChoice1(getString(R.string.sciencechoiceq1a));
        techQ1.setAnswerChoice2(getString(R.string.sciencechoiceq1b));
        techQ1.setAnswerChoice3(getString(R.string.sciencechoiceq1c));
        techQ1.setAnswerChoice4(getString(R.string.sciencechoiceq1d));
        techQ1.setQuestionCategory(TECH);
        techQ1.setDifficultyLevel("Easy");
        allQuestions.add(techQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ1);
        realm.commitTransaction();

        final Question techQ2 = new Question();
        techQ2.setId(8);
        techQ2.setQuestion(getString(R.string.scienceq2));
        techQ2.setAnswer(getString(R.string.sciencea2));
        techQ2.setAnswerChoice1(getString(R.string.sciencechoiceq2a));
        techQ2.setAnswerChoice2(getString(R.string.sciencechoiceq2b));
        techQ2.setAnswerChoice3(getString(R.string.sciencechoiceq2c));
        techQ2.setAnswerChoice4(getString(R.string.sciencechoiceq2d));
        techQ2.setQuestionCategory(TECH);
        techQ2.setDifficultyLevel("Medium");
        allQuestions.add(techQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ2);
        realm.commitTransaction();

        final Question techQ3 = new Question();
        techQ3.setId(9);
        techQ3.setQuestion(getString(R.string.scienceq3));
        techQ3.setAnswer(getString(R.string.sciencea3));
        techQ3.setAnswerChoice1(getString(R.string.sciencechoiceq3a));
        techQ3.setAnswerChoice2(getString(R.string.sciencechoiceq3b));
        techQ3.setAnswerChoice3(getString(R.string.sciencechoiceq3c));
        techQ3.setAnswerChoice4(getString(R.string.sciencechoiceq3d));
        techQ3.setQuestionCategory(TECH);
        techQ3.setDifficultyLevel("Hard");
        allQuestions.add(techQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(techQ3);
        realm.commitTransaction();

        final Question mathQ1 = new Question();
        mathQ1.setId(10);
        mathQ1.setQuestion(getString(R.string.mathq1));
        mathQ1.setAnswer(getString(R.string.matha1));
        mathQ1.setAnswerChoice1(getString(R.string.mathchoiceq1a));
        mathQ1.setAnswerChoice2(getString(R.string.mathchoiceq1b));
        mathQ1.setAnswerChoice3(getString(R.string.mathchoiceq1c));
        mathQ1.setAnswerChoice4(getString(R.string.mathchoiceq1d));
        mathQ1.setQuestionCategory(MATH);
        mathQ1.setDifficultyLevel("Easy");
        allQuestions.add(mathQ1);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ1);
        realm.commitTransaction();

        final Question mathQ2 = new Question();
        mathQ2.setId(11);
        mathQ2.setQuestion(getString(R.string.mathq2));
        mathQ2.setAnswer(getString(R.string.matha2));
        mathQ2.setAnswerChoice1(getString(R.string.mathchoiceq2a));
        mathQ2.setAnswerChoice2(getString(R.string.mathchoiceq2b));
        mathQ2.setAnswerChoice3(getString(R.string.mathchoiceq2c));
        mathQ2.setAnswerChoice4(getString(R.string.mathchoiceq2d));
        mathQ2.setQuestionCategory(MATH);
        mathQ2.setDifficultyLevel("Medium");
        allQuestions.add(mathQ2);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ2);
        realm.commitTransaction();

        final Question mathQ3 = new Question();
        mathQ3.setId(12);
        mathQ3.setQuestion(getString(R.string.mathq3));
        mathQ3.setAnswer(getString(R.string.matha3));
        mathQ3.setAnswerChoice1(getString(R.string.mathchoiceq3a));
        mathQ3.setAnswerChoice2(getString(R.string.mathchoiceq3b));
        mathQ3.setAnswerChoice3(getString(R.string.mathchoiceq3c));
        mathQ3.setAnswerChoice4(getString(R.string.mathchoiceq3d));
        mathQ3.setQuestionCategory(MATH);
        mathQ3.setDifficultyLevel("Hard");
        allQuestions.add(mathQ3);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(mathQ3);
        realm.commitTransaction();
    }

}
