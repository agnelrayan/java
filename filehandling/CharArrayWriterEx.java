package com.expertzlab.filehandling;

import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * Created by geo on 9/10/17.
 */
public class CharArrayWriterEx {
    public static void main(String[] args) throws Exception{
        CharArrayWriter ch = new CharArrayWriter();
        ch.write("Yes We have done.");
        FileWriter file1 = new FileWriter("ab.txt");
        FileWriter file2 = new FileWriter("ac.txt");
        FileWriter file3 = new FileWriter("ad.txt");
        FileWriter file4 = new FileWriter("ae.txt");

       // System.out.println(ch.size());


        ch.writeTo(file1);
        ch.writeTo(file2);
        ch.writeTo(file3);
        ch.writeTo(file4);

       // ch.close();
        file1.close();
        file2.close();
        file3.close();
        file4.close();

        System.out.println("It is written successfully");


    }
}
