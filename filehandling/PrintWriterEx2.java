package com.expertzlab.filehandling;

import java.io.PrintWriter;

/**
 * Created by geo on 9/10/17.
 */
public class PrintWriterEx2 {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("ah.txt");
        pw.write("Write into ah.txt");
        pw.flush();
        pw.close();
        System.out.println("It is written");
    }
}
