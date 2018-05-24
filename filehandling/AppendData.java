package com.expertzlab.filehandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by geo on 9/10/17.
 */
public class AppendData {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("abc123.txt");
        PrintWriter pw = new PrintWriter(fw,true);

        Scanner input = new Scanner(System.in);
        int grade=0;

        System.out.println("Enter a grade(-1 to quit:");
        grade = input.nextInt();

        System.out.println("Enter id");
        int id=input.nextInt();

        while(grade!=-1&&id!=-1){
            pw.println(grade);
            pw.println(id);
            System.out.println("Enter a grade(-1 to quit:");
            grade = input.nextInt();
            id=input.nextInt();
        }
        pw.close();


    }
}
