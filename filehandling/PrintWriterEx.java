package com.expertzlab.filehandling;

import java.io.PrintWriter;

/**
 * Created by geo on 9/10/17.
 */
public class PrintWriterEx {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("ag.txt");
        pw.write("Write into");
        pw.write("helo welcome");
        pw.write(65);
        pw.flush();
        pw.close();


    }
}
