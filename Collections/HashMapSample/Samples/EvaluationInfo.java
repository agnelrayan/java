package com.expertzlab.Collections.HashMapSample.Samples;

public class EvaluationInfo {
    String rollNumber;
    String name;
    String totalMark;

    @Override
    public String toString() {
        return "EvaluationInfo{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                ", totalMark='" + totalMark + '\'' +
                '}';
    }



    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }


}
