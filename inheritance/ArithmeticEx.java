package com.expertzlab.inheritance;

import java.io.IOException;
import java.util.Scanner;
public class ArithmeticEx {
    static int a,b,c;
    public static void add(){
        c=a+b;
        System.out.println(c);
    }
    public static void sub(){
        c=a-b;
        System.out.println(c);

    }
    public static void main(String[] args) throws IOException{
        Scanner obj = new Scanner(System.in);


        int number;
        System.out.println("Choose the Option");
        System.out.println("1.Addtion, type + ");
        System.out.println("2.Substraction, type -");
       // number = obj.nextInt();
        char c = (char) System.in.read();
        System.out.println("Enter the A value");
        a = obj.nextInt();

        System.out.println("Enter the B value");
        b = obj.nextInt();


        switch(c){
            case '+':
                add();
                break;
            case '-':
                sub();
                break;
            default:
                System.out.println("Choose correct option");
                break;
        }

    }
}
