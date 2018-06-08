package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class ThrowsEx2 {
    public static void main(String[] args) throws IOException{

            FileWriter fileWriter = new FileWriter("Ag.txt");
            fileWriter.write("hi hw r u hw r the things?");
            fileWriter.close();
            System.out.println("Content is Written in File");


    }
}
