package com.expertzlab.filehandling;

import java.io.*;
import java.util.Date;

public class FileDemo7{
    public static void main(String[] args) throws IOException{
        //long startTime = new Date().getTime();
        FileOutputStream fout = new FileOutputStream("ax.txt");
        FileOutputStream fout2 = new FileOutputStream("ay.txt");
        FileOutputStream fout3 = new FileOutputStream("az.txt");
        String str = "Welcome to ExpertzLab..";
        byte[] bytes = str.getBytes();
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        //bout.write(bytes);
        BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
        BufferedOutputStream bout3 = new BufferedOutputStream(fout3);
        bout2.write(bytes);
        bout.write(bytes);
        bout3.write(bytes);
        System.out.println("Written Successfully..");
        bout.close();
        bout2.close();
        bout3.close();
        //fout.close();
       // fout2.close();
       // fout3.close();

       /* FileInputStream fin = new FileInputStream("ax.txt");
        //BufferedInputStream bin = new BufferedInputStream(fin);
        int i=0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }*/
       // long endTime = new Date().getTime();
       //  System.out.println("elapsed milliseconds: " + (endTime - startTime));

    }

}
