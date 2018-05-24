package com.expertzlab.Collections.HashMapSample;

import java.util.Set;


public class AnswerSheet {
    String rollNo;
    String name;
    Set<Answer> answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnswerSheet)) return false;

        AnswerSheet that = (AnswerSheet) o;

        if (!getRollNo().equals(that.getRollNo())) return false;
        if (!getName().equals(that.getName())) return false;
        return getAnswer().equals(that.getAnswer());

    }

    @Override
    public int hashCode() {
        int result = getRollNo().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAnswer().hashCode();
        return result;
    }



    @Override
    public String toString() {
        return "AnswerSheet{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", answer=" + answer +
                '}';
    }



    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(Set<Answer> answer) {
        this.answer = answer;
    }

}
