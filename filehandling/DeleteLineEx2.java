package com.expertzlab.filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class DeleteLineEx2 {

    public static void main(String[] args) throws Exception {

// Creates file to write to
        Writer output = null;
        output = new BufferedWriter(new FileWriter("output.txt"));
        String newline = System.getProperty("line.separator");
        Scanner input = new Scanner("output");
        while(input.hasNextLine()){
            System.out.println(input.nextLine());
        }
       // System.out.println(newline);

// Read in a file & process line by line
        FileInputStream in = new FileInputStream("input.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;

        while ((strLine = br.readLine()) != null) {

            System.out.println(strLine);

// Open up standard input from command
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            String command = null;

            System.out.println("Delete line?");


            try {
                command = br2.readLine();
                if (command.equals("delete")){
                    System.out.println("Line Deleted.");
                    System.out.println("");
                }else{
// Write non deleted lines to file
                    output.write(strLine);
                    output.write(newline);
                }

            } catch (IOException ioe) {
                System.out.println("IO error reading command line input");
                System.exit(1);
            }

        }
        output.close();
        System.out.println("End of file. DonCash is the man.");
    }
}
