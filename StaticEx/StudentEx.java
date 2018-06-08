package com.expertzlab.StaticEx;

import java.util.Scanner;

/**
 * Created by geo on 21/917.
 */
public class StudentEx {

    static int id;
    static String name;
    static int mark1;
    static int mark2;
    static int mark3;
    static int number;
    static int total;
    static int average;

    public void display(){
        System.out.println("Student Name is:" + name);
        System.out.println("Id is:" + id);
        System.out.println("Mark1 is:" + mark1);
        System.out.println("Mark2 is:" + mark2);
        System.out.println("Mark3 is:" + mark3);
        System.out.println("Total is:" + total);
        System.out.println("The average is:" + average);

        StaticEx3 obj3 = new StaticEx3();

    }
    public static void main(String[] args) {

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the No. of Students");
        number = obj2.nextInt();

        for (int i = 1; i <= number; i++) {
            Scanner obj = new Scanner(System.in);

            System.out.println("Enter the Student Name");
            name = obj.nextLine();


            System.out.println("Enter the Student Id");
            id = obj.nextInt();


            System.out.println("Enter the Mark1");
            mark1 = obj.nextInt();


            System.out.println("Enter the Mark2");
            mark2 = obj.nextInt();
            //System.out.println("Mark2 is:"+mark2);

            System.out.println("Enter the Mark3");
            mark3 = obj.nextInt();
            //System.out.println("Mark3 is :" +mark3);

            total = mark1 + mark2 + mark3;


            average = total / 3;
            //display();


        }



    }

    }

