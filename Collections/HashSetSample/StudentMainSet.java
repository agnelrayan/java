package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;

public class StudentMainSet {
    public static void main(String[] args) {
        StudentSet obj1 = new StudentSet(1,"AB",90);
        StudentSet obj2 = new StudentSet(3,"XY",85);
        StudentSet obj3 = new StudentSet(2,"IJ",95);

        HashSet<StudentSet> set = new HashSet();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        for(StudentSet s:set){
            System.out.println("Student Id:"+" "+s.studId+"Student Name:"+" "+s.studName+"Student Marks:"+ " "+s.studMarks);
        }

    }
}
