package com.expertzlab.filehandling;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args)  throws Exception{
       // FileOutputStream fout = new FileOutputStream("af.txt");
        PrintStream ps = new PrintStream("af.txt");
        ps.println("write into PrintStream Class");
        ps.println('a');
        ps.println(97);
        ps.println('b');
        ps.close();
        System.out.println("It is written Successfully");
    }
}
