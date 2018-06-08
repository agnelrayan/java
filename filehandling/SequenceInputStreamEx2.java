package com.expertzlab.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/**
 * Created by geo on 9/10/17.
 */
public class SequenceInputStreamEx2 {
    public static void main(String[] args) throws Exception{
        //InputStream in = new FileInputStream("ag2.txt");
        FileInputStream fin = new FileInputStream("abc123.txt");
        FileInputStream fin2 = new FileInputStream("ijk123.txt");
        FileOutputStream fout = new FileOutputStream("out123.txt");

        SequenceInputStream sin = new SequenceInputStream(fin,fin2);
        int i=0;
        while((i=sin.read())!=-1){
            fout.write(i);
            System.out.print((char)i);
        }
       // System.out.println((char)i);
        sin.close();
        fout.close();
        fin.close();
        fin2.close();
        System.out.println("Success");
    }
}
