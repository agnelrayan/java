package com.expertzlab.filehandling;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;


public class ByteArrayInputStreamEx {
    public static void main(String[] args) throws Exception{
      byte[] bytes = {65,66,67,68};
        //String bytes ="For ByteArrayInputStream"

        //FileInputStream fin1 = new FileInputStream("a123.txt");
        //FileInputStream fin2 = new FileInputStream("a456.txt");
        //FileInputStream fin3 = new FileInputStream("a768.txt");

        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);

        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }

        System.out.println("Successfully read");

    }
}
