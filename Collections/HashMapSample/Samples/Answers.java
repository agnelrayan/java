package com.expertzlab.Collections.HashMapSample.Samples;

public class Answers {

    String questionNumber;
    String answer;
    int mark;

    public Answers(String questionNumber, String answer, int mark) {
        this.questionNumber = questionNumber;
        this.answer = answer;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "questionNumber='" + questionNumber + '\'' +
                ", answer='" + answer + '\'' +
                ", mark=" + mark +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Answers)) return false;

        Answers answers = (Answers) o;

        if (getMark() != answers.getMark()) return false;
        if (!getQuestionNumber().equals(answers.getQuestionNumber())) return false;
        return getAnswer().equals(answers.getAnswer());

    }

    @Override
    public int hashCode() {
        int result = getQuestionNumber().hashCode();
        result = 31 * result + getAnswer().hashCode();
        result = 31 * result + getMark();
        return result;
    }



    public Answers() {
    }



    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }


}
