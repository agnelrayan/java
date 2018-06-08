package com.expertzlab.inheritance.mypack;

/**
 * Created by agnel on 5/23/18.
 */
public class MethodOverload {
    public static void sum(int a, int b){

        System.out.println("Addition of Two Integer Numbers:"+(a+b));

    }


    public static void sum(float a,float b){
        System.out.println("Addition of Two Floating Numbers:"+(a+b));

    }

    public static void sum(float a, int b){
        System.out.println("Addition of Float and Integer:"+(a+b));
    }

    public static void sum(int a, float b){
        System.out.println("Addition of Int and Float:"+(a+b));

    }

    public static void sum(Integer a, Integer b){
        System.out.println("Addition of two Wrapper Classes:"+(a+b));
    }


    public static void main(String[] args) {
        sum(10f,20);
        sum(10,20f);
        sum(new Integer(100),new Integer(200));
    }


}
