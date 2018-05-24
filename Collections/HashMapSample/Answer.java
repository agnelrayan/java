package com.expertzlab.Collections.HashMapSample;

public class Answer {
    String questionNumber;
    String answer;
    Integer mark;

    public Answer(String s, String s1) {
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        int result = getQuestionNumber().hashCode();
        result = 31 * result + getAnswer().hashCode();
        result = 31 * result + getMark().hashCode();
        return result;
    }



    @Override
    public String toString() {
        return "Answer{" +
                "questionNumber='" + questionNumber + '\'' +
                ", answer='" + answer + '\'' +
                ", mark=" + mark +
                '}';
    }



    public Answer(String questionNumber, String answer, Integer mark) {
        this.questionNumber = questionNumber;
        this.answer = answer;
        this.mark = mark;
    }



    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }


}
