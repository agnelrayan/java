package com.expertzlab.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

/**
 * Created by geo on 9/10/17.
 */
public class SequenceInputStreamEx {
    public static void main(String[] args) throws Exception {
        FileInputStream fin1 = new FileInputStream("ijk123.txt");
        FileInputStream fin2 = new FileInputStream("rst123.txt");
        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);
        int i=0;

        while((i=sin.read())!=-1){
            System.out.print((char)i);
        }
    }
}
