package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        double average;
        int total =0;

        ArrayList<Integer> grade = new ArrayList<Integer>();
        grade.add(90);
        grade.add(87);
        grade.add(95);


        for(int i=0;i<grade.size();i++){
            total+=grade.get(i);
        }
        average=total/grade.size();
        System.out.println(total);
        System.out.println(average);
    }
}
