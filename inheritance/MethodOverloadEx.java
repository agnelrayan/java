package com.expertzlab.inheritance;

public class MethodOverloadEx {
    static double c;
    static int a(int a,float b){
        c=a+b;
        System.out.println("Addition:"+c);
        return 0;
    }
    static int a(int a){
        c=a;
        System.out.println("Value:"+c);
        return 0;
    }

    static double a(double a, double b){
        c=a-b;
        System.out.println("Sub"+c);
        return 0;

    }

    public static void main(String[] args) {
        a(200,100);
        a(10);
        a(100,100.89f);

    }
}
