package com.expertzlab.sample3.test;


import java.util.Scanner;

/**
 * Created by agnel on 5/15/18.
 */




public class Sample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the String value:");
        String str = sc.next();


        System.out.println("Enter the a value:");
        int a=sc.nextInt();
        System.out.println("Enter the b value:");
        int b=sc.nextInt();
        int c=a+b;


        System.out.println("Enter float value:");
        float f = sc.nextFloat();




        System.out.println("Addition:"+c);
        System.out.println("The value of Float:"+f);
        System.out.println("STring is:"+str);

    }
}
