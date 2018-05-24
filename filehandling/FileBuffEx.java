package com.expertzlab.filehandling;

import java.io.*;
import java.util.Date;
public class FileBuffEx {
    public static void main(String[] args) throws Exception{

        long startTime = new Date().getTime();

        //FileInputStream fin = new FileInputStream("agn.txt");

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("agn.txt"));
       FileOutputStream fout = new FileOutputStream("Ag12.txt");
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("Ag12.txt"));

        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
            bout.write(i);
        }


        System.out.println("----");
        long endTime = new Date().getTime();
        System.out.println("elapsed milliseconds: " + (endTime - startTime));
    }
}