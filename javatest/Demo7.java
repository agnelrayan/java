package com.expertzlab.javatest;

/**
 * Created by agnel on 3/23/18.
 */
//Read the Student Name, Age, Department from the Keyboard.
import java.util.Scanner;
import java.util.Arrays;
public class Demo7 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the name");
        String name=obj.nextLine();



        System.out.println("Enter the age");
        int age = obj.nextInt();

        System.out.println("Enter the Salary");
        float salary=obj.nextFloat();

        System.out.println("Enter the Profit ");
        double profit=obj.nextDouble();

        System.out.println("Enter the Yes/No");
        boolean option=obj.nextBoolean();



        System.out.println("Hi Welcome Mr."+name);
        System.out.println("Age is:"+age);
        System.out.println("Salary is:+");
       // System.out.println("Char is:"+ch);

            }
}
