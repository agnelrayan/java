package com.expertzlab.filehandling;

import java.io.Console;
public class ConsoleEx2 {
    public static void main(String[] args) {
        Console con = System.console();
        System.out.println("Enter Password");

        char[] ch = con.readPassword();

        String pass = String.valueOf(ch);
        System.out.println("Your Password"+pass);
    }
}
