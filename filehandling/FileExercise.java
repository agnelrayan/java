package com.expertzlab.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class FileExercise {
    static String fileName="abc125.txt";
    public static void main(String[] args) {
        int menuItem=-1;
        while(menuItem!=0){
            menuItem=menu();
            switch(menuItem){
                case 1:
                    showList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Dont recognize the input");

            }
        }

    }

    static int menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("\n Main Menu \n");
        System.out.println("0. Exit the Program");
        System.out.println("1. Display to-do List");
        System.out.println("2. Add item to-do List");
        System.out.println("3. Remvoe item from to-do List");
        System.out.println();
        System.out.println("Enter a choice");
        choice=input.nextInt();
        return choice;


    }
    static void showList(){
        System.out.println("\n To-do List \n");
        try{
            Scanner inFile = new Scanner(new FileReader(fileName));
            String line;
            int number=1;
            while(inFile.hasNextLine()){
                line=inFile.nextLine();
                System.out.println(number+" ");
                System.out.println(line);
                ++number;
            }
            System.out.println();
            inFile.close();
        }
        catch(IOException ioe){
            System.out.println("Can't access file.");
        }
    }

    static void addItem(){
        System.out.println("\n Add Item \n");
        try{
            Scanner input = new Scanner(System.in);
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
            System.out.println("Enter an Item:");
            String item = input.nextLine();
            outFile.println(item);
            outFile.close();
                            }
        catch(IOException ioe){
            System.out.println("Can't access file");
        }
    }

    static void removeItem(){
        int choice;
        showList();
        Scanner input = new Scanner(System.in);
        System.out.println("Which item do you want to remove?");
        choice = input.nextInt();

        ArrayList<String> items = new ArrayList<String>();
        int number=1;
        try{
            Scanner inFile = new Scanner(new FileReader(fileName));
            String item;
            while(inFile.hasNextLine()){
                item=inFile.nextLine();
                if(number!=choice)
                    items.add(item);
                ++number;
            }
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for(int i=0;i<items.size();++i)
                outFile.println(items.get(i));
            outFile.close();
        }
        catch(IOException ioe){
            System.out.println("Can't Access");
        }

    }
}
