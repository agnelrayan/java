package com.expertzlab.Collections.HashMapSample.Samples;

import com.expertzlab.examples.*;

import java.util.Set;

public class AnswerSheet {
    int rollNumber;
    String answer;
    Set<Answers> answersSet;

    @Override
    public String toString() {
        return "AnswerSheet{" +
                "rollNumber=" + rollNumber +
                ", answer='" + answer + '\'' +
                ", answersSet=" + answersSet +
                '}';
    }



    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Set<Answers> getAnswersSet() {
        return answersSet;
    }

    public void setAnswersSet(Set<Answers> answersSet) {
        this.answersSet = answersSet;
    }


}
