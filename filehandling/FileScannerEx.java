package com.expertzlab.filehandling;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileScannerEx {
    public static void main(String[] args) throws Exception{
     /*   FileWriter fw = new FileWriter("Agnew.txt",true);
        PrintWriter pw = new PrintWriter(fw);
        Scanner input = new Scanner(pw);

        System.out.println("Enter the Name");
        String name = input.nextLine();
        System.out.println("Enter the Id");

        int id = input.nextInt();
        System.out.println("Name:"+name);
        System.out.println("id:"+id);

        pw.println("Your Name is"+name);
        pw.println("Your id is"+id);*/
        String fileName="Agnew.txt";
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
        System.out.println("Enter an Item:");
        String item = input.nextLine();
        outFile.println(item);

        System.out.println("Enter the Id");
        int id = input.nextInt();
        outFile.println(id);
        String name="";
        System.out.println("Enter to Stop the Items or Enter the Stock INformation:");
        name=input.next();
        while(!name.equals("stop")) {
            System.out.println("Enter the String");
            name = input.next();
            outFile.print(name);
            System.out.println("Enter the Id");
            id = input.nextInt();
            outFile.print(id);
            System.out.println("The given name is" + name+"ID is"+id);
        }
        System.out.println("You have selected Stop");


        outFile.close();


        }
    }



