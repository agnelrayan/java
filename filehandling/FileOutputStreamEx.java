package com.expertzlab.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by geo on 9/10/17.
 */
public class FileOutputStreamEx {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("ag4.txt");
        String str = "Welcome to Java File";
        byte[] byteStr = str.getBytes();
        //
        // fos.write(str);
        fos.write(byteStr);
        System.out.println("It is written in file");
        fos.close();
    }
}
