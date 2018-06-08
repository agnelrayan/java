package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class Test {
    String studentName;

    void display() {
        System.out.println("Student Name:"+studentName);
    }


    public static void main(String[] args){
        //int age=25;
       // System.out.println("Age:"+age);

        Test obj = new Test();
        obj.studentName="AG";
        obj.display();


    }

}
