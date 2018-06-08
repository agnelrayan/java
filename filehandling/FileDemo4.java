package com.expertzlab.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileDemo4 {
    public static void main(String[] args) throws IOException{
        InputStream fin = new FileInputStream("abc123.txt");
        FileOutputStream fout = new FileOutputStream("abc1244.txt",true);
        int i=0;
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
            fout.write(i);
        }
    }
}
