package com.expertzlab.Basics;

import java.util.Scanner;

public class JavaTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A value");
        int a = input.nextInt();
        System.out.println("Enter B value");
        int b=input.nextInt();

        int c =a+b;
        System.out.println("The value of C is:"+c);

    }
}
