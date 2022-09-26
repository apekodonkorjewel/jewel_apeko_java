package com.company.Summative1AssessmentApekoJewel.models;

import java.util.Objects;

public class Answer {
    int id;
    String question;
    String answer;

    public Answer(int id, String answer){
        this.id = id;
        this.question = "";
        this.answer = answer;
    }

    public Answer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return getId() == answer1.getId() && Objects.equals(getQuestion(), answer1.getQuestion()) && Objects.equals(getAnswer(), answer1.getAnswer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuestion(), getAnswer());
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
