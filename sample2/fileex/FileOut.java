package com.expertzlab.sample2.fileex;


import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by agnel on 5/10/18.
 */
public class FileOut {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("ag.txt");
        String str = "Welcome to Java File";

        byte[] bStr = str.getBytes();

        fout.write(bStr);

        System.out.println("File is Written Successfully");
    }
}
