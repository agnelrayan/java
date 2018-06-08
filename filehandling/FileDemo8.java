package com.expertzlab.filehandling;

import java.io.Console;
import java.io.IOException;

public class FileDemo8{
    public static void main(String[] args) throws IOException{
        Console con = System.console();
        System.out.println("Enter Password");

        char[] ch = con.readPassword();

        String pass = String.valueOf(ch);
        System.out.println("Your Password:"+pass);
    }
}
