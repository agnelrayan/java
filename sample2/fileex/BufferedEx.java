package com.expertzlab.sample2.fileex;

import com.google.common.io.FileBackedOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by agnel on 5/15/18.
 */
public class BufferedEx {
    public static void main(String[] args)throws Exception{
        //FileOutputStream out = new FileOutputStream("xyz.txt");
        BufferedOutputStream bout = new BufferedOutputStream( new FileOutputStream("xyz.txt"),1);
        String str ="Welcome to Buffered Examples...";
        byte[] byteStr = str.getBytes();
        bout.write(byteStr);
        System.out.println("Success...");
        bout.flush();

        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("xyz.txt"));
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
    }
}
