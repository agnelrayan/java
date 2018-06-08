package com.expertzlab.Collections.LinkedHashMapSample;

import java.util.Map;
import java.util.TreeMap;

public class StudentMainTHM {
    public static void main(String[] args) {
        StudentTHM obj1 = new StudentTHM(1,"Ag");
        StudentTHM obj2 = new StudentTHM(3,"Ray");
        StudentTHM obj3 = new StudentTHM(2,"JOe");
        StudentTHM obj4 = new StudentTHM(4,"Kevin");

        TreeMap <Integer,StudentTHM>map = new TreeMap<Integer, StudentTHM>();
        map.put(2,obj1);
        map.put(4,obj2);
        map.put(1,obj3);
        map.put(3,obj4);

        for(Map.Entry<Integer,StudentTHM> entry: map.entrySet()){
           // System.out.println(entry.getKey());
            int i = entry.getKey();
            System.out.println("Key value:"+i);
            //System.out.println(entry.getValue());

            StudentTHM thm = entry.getValue();

            System.out.println("Student Id:"+thm.studId+"Student Name:"+thm.studName);
        }

    }
}
