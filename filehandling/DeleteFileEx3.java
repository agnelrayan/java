package com.expertzlab.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by geo on 12/10/17.
 */
public class DeleteFileEx3 {
    public static void main(String[] args) throws Exception {

        String fileName = "abc123.txt";

        int choice;
        //showList();
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
                //System.out.println(item);
                if (number != choice)
                    //System.out.println(number);
                    items.add(item);
                ++number;
                //System.out.println(items);
            }
        }
        catch (IOException ioe) {
            System.out.println("Can't Access");
        }
    }
}
         /*   PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int i = 0; i < items.size(); ++i)
                outFile.println(items.get(i));
           // System.out.println(items.get(i));
            //System.out.println(outFile.println(items.get(i)));
            outFile.close();
        } catch (IOException ioe) {
            System.out.println("Can't Access");
        }

    }*/
