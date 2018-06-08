package com.expertzlab.filehandling;

import java.io.Console;


public class ConsoleEx {
    public static void main(String[] args) throws Exception {
        Console con = System.console();
        System.out.println("Enter your name");
        String str = con.readLine();
        System.out.println("Welcome"+str);
    }
}
