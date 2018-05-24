package com.expertzlab.filehandling;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileScanEx {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = input.nextLine();

        System.out.println("Enter the Id");
        int id = input.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Name:"+id);

        String file = "file1.txt";
        PrintWriter pw = new PrintWriter(new FileWriter(file,true));
        pw.print(name);
        pw.print(" ");
        pw.print(id);

    }
}
