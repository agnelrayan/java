package com.expertzlab.javatest;

/**
 * Created by agnel on 3/24/18.
 */

//Write a program for calculator using static method and non-static method.

public class MethodDemo {

    static int c;

    public static void add(int a,int b,int d,int e){
        c=a+b+d+e;
        System.out.println("Addition value is:"+c);

    }

    public static void sub(int a,int b){

        c=a-b;
        System.out.println("Sub is:"+c);


    }

    public static void mul(int a,int b){
        c=a*b;
        System.out.println("Multiplication:"+c);

    }

    public static void div(int a,int b){
        c=a/b;
        System.out.println("Division:"+c);

    }

    public static void modulodiv(int x,int y){
        c=x%y;
        System.out.println("Modulo Division is:"+c);

    }


    public static void main(String[] args) {
        add(10,20,30,40);
        sub(20,10);
        mul(10,20);
        div(91,10);//9--quotient
        modulodiv(91,10);//1--remainder

    }
}
