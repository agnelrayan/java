package com.expertzlab.sample3.test;

import com.expertzlab.sample3.test.test2.Student;

/**
 * Created by agnel on 5/21/18.
 */
public class HashCodeEx extends Object {
    public static void main(String[] args) {
        Student st1 = new Student(10,"AG");
        Student st2 = new Student(10,"AGN");
        Student st3 = new Student(10,"AG");

        System.out.println(st1.equals(st2));//true

        System.out.println("St1:"+st1.hashCode());
        System.out.println("St2:"+st2.hashCode());
        System.out.println("St3:"+st3.hashCode());

    }
}
