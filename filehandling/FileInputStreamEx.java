package com.expertzlab.filehandling;

import java.io.FileInputStream;

/**
 * Created by geo on 9/10/17.
 */
public class FileInputStreamEx {
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("ag4.txt");
        int i=fin.read();
        System.out.println((char)i);
    }
}
