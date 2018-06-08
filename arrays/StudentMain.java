package com.expertzlab.arrays;


public class StudentMain {
    public static void main(String[] args) {
        Student2[] obj = new Student2[2];
        obj[0] = new Student2(10,"AB");
        obj[1] = new Student2(20,"Ray");

        obj[0].display();
        obj[1].display();

    }
}
