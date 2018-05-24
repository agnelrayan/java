package com.expertzlab.filehandling;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteLineEx {
    static String fileName="abc123.txt";
    static void removeItem() throws Exception{
        int choice;
         showList();
        Scanner input = new Scanner(System.in);
        System.out.println("Which item do you want to remove?");
        choice = input.nextInt();

        ArrayList<String> items = new ArrayList<String>();
        int number = 1;
        try {
            Scanner inFile = new Scanner(new FileReader(fileName));
            String item;
            while (inFile.hasNextLine()) {
                item = inFile.nextLine();
                if (number != choice)
                    items.add(item);
                ++number;
            }
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i < items.size(); ++i)
                outFile.println(items.get(i));
            outFile.close();
        } catch (IOException ioe) {
            System.out.println("Can't Access");
        }
    }
        static void showList()throws Exception{
            System.out.println("To-Do List---");
            Scanner input = new Scanner(fileName);
            String line;
            int number=1;
            while(input.hasNextLine()){
                line=input.nextLine();
                number++;

            }
            input.close();
    }



    public static void main(String[] args) throws Exception{

        DeleteLineEx obj = new DeleteLineEx();
        removeItem();
    }


}
