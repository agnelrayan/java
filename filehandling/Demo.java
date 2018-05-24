package com.expertzlab.filehandling;


import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception{

        String str = "Welcome to Java File";
        byte[] bytes = str.getBytes();

        FileOutputStream out = new FileOutputStream("myfile");
       BufferedOutputStream bout = new BufferedOutputStream(out);

        out.write(bytes);
        System.out.println("Successfully is written.");

        FileInputStream in = new FileInputStream("myfile");
        BufferedInputStream bin = new BufferedInputStream(in);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);

        }
    }
}
