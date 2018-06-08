package com.expertzlab.filehandling;

import java.io.FileInputStream;

/**
 * Created by geo on 9/10/17.
 */
public class FileInputStreamex2 {
    public static void main(String[] args) throws Exception{
        FileInputStream fos = new FileInputStream("ag4.txt");
        int i=0;

        while((i=fos.read())!=-1){
            System.out.print((char)i);
        }

    }
}
