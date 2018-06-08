package com.expertzlab.Basics;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the a value");
        int a = obj.nextInt();

        System.out.println("Enter the b value");
        int b= obj.nextInt();

        int c = a+b;
        System.out.println("The Addition of A & B:" +c);

        System.out.println("Enter the String value");
        String str = obj.nextLine();
        System.out.println("Welcome:"+str);

        System.out.println("Enter the Second String");
        String str2 = obj.next();
        System.out.println("Helo:"+str2);

    }

}
