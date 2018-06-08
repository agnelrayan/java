package com.expertzlab.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo6 {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("abc11.txt");
        BufferedOutputStream bout = new BufferedOutputStream(out);
        String str ="You";
        byte[] bytes=str.getBytes();
        bout.write(bytes);
       // bout.flush();
        bout.close();
       // out.close();

        FileInputStream fin = new FileInputStream("abc11.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i2=bin.available();
        System.out.println("I2:"+i2);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);

        }

    }


}
