package com.expertzlab.filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;


public class DataInputStreamEx {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("agn3.txt");
        DataInputStream din = new DataInputStream(in);
        int i=0;

        while((i=din.read())!=-1){
            System.out.print((char)i);
        }

        System.out.println("it is read successfully");
        din.close();

    }
}
