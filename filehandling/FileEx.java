package com.expertzlab.filehandling;

/**
 * Created by geo on 9/10/17.
 */
public class FileEx {
    public static void main(String[] args){
        try {
            System.err.println("In Error page");
            System.out.println("In file handling");

            System.out.println("Enter the char");
            int i = System.in.read();
            System.out.println((char) i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
