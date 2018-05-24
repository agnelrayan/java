package com.expertzlab.ExceptionHandlingEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptEx {
    public static void main(String[] args){
        try{
            FileInputStream fis=new FileInputStream("Ag.txt");
            int k;
            while((k=fis.read())!=-1){
                System.out.println((char)k);
            }
            fis.close();
        }
        catch(IOException e){
            System.out.println("File could not open");

        }
    }
}
