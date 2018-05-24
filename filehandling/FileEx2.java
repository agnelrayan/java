package com.expertzlab.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by geo on 9/10/17.
 */
public class FileEx2 {
    public static void main(String[] args) throws Exception{
        //FileOutputStream file = new FileOutputStream("ag123.txt");

        //String str ="ag123.txt";
        FileReader file = new FileReader("ag123.txt");
        Scanner obj = new Scanner(file);

        int grade;
        while(obj.hasNextLine()){
            grade =Integer.parseInt(obj.nextLine());
            System.out.println(grade);
        }




    }
}
