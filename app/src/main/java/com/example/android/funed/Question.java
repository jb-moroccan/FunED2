package com.example.android.funed;

import io.realm.RealmObject;

/* Created by Jenna on 6/24/2017. */

public class Question extends RealmObject {
    private int id;
    private String question;
    private String answer;
    private String answerChoice1;
    private String answerChoice2;
    private String answerChoice3;
    private String answerChoice4;
    private int questionCategory;
    private String difficultyLevel;

    public int getId() {
        return id;
    }

    public void setId(int couponId) {
        this.id = couponId;
    }

    public String getQuestion(){ return question; }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer(){ return answer; }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswerChoice1(){ return answerChoice1; }

    public void setAnswerChoice1(String answerChoice1) {
        this.answerChoice1 = answerChoice1;
    }

    public String getAnswerChoice2(){ return answerChoice2; }

    public void setAnswerChoice2(String answerChoice2) {
        this.answerChoice2 = answerChoice2;
    }

    public String getAnswerChoice3(){ return answerChoice3; }

    public void setAnswerChoice3(String answerChoice3) {
        this.answerChoice3 = answerChoice3;
    }

    public String getAnswerChoice4(){ return answerChoice4; }

    public void setAnswerChoice4(String answerChoice4) {
        this.answerChoice4 = answerChoice4;
    }

    public int getQuestionCategory(){ return questionCategory; }

    public void setQuestionCategory(int questionCategory) {this.questionCategory = questionCategory;}

    public String getDifficultyLevel(){ return difficultyLevel; }

    public void setDifficultyLevel(String difficultyLevel) {this.difficultyLevel = difficultyLevel;}
}

