package com.expertzlab.filehandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by geo on 11/10/17.
 */
public class ScannerFileEx3 {
    public static void main(String[] args) throws Exception{

        String str ="input.txt";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = input.nextLine();
        System.out.println("Enter the id");
        String id = input.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        PrintWriter pw = new PrintWriter(new FileWriter(str,true));
        pw.print("Name:"+name);
        pw.print(",");
        pw.print("Id:"+id);
        pw.close();

      /*  String fileName="Agnew.txt";
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
        System.out.println("Enter an Item:");
        String item = input.nextLine();
        outFile.println(item);*/

    }
}
