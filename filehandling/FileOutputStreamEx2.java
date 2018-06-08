package com.expertzlab.filehandling;

import java.io.FileOutputStream;


public class FileOutputStreamEx2 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("ag5.txt");
        String str ="Welcome to Java File";
        byte[] bytestr = str.getBytes();
        fos.write(bytestr);
        fos.close();

        System.out.println("It is written successfully");
    }
}
