package com.expertzlab.examples;


public class AnswerKey {

    String answers;

    public AnswerKey(String answers) {
        this.answers = answers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnswerKey)) return false;

        AnswerKey answerKey = (AnswerKey) o;

        return getAnswers() != null ? getAnswers().equals(answerKey.getAnswers()) : answerKey.getAnswers() == null;

    }

    @Override
    public int hashCode() {
        return getAnswers() != null ? getAnswers().hashCode() : 0;
    }






    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }


    @Override
    public String toString() {
        return "AnswerKey{" +
                "answers='" + answers + '\'' +
                '}';
    }






}
