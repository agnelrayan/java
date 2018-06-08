package com.expertzlab.Collections.HashMapSample;


public class EvaluationInfo {
    String rollNo;
    String name;
    Integer totalMark;

    @Override
    public String toString() {
        return "EvaluationInfo{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", totalMark=" + totalMark +
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

    public Integer getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(Integer totalMark) {
        this.totalMark = totalMark;
    }



}
