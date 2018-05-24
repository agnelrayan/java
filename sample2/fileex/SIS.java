package com.expertzlab.sample2.fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created by agnel on 5/16/18.
 */
public class SIS {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("ag.txt");
        FileInputStream in2 = new FileInputStream("ag2.txt");
        SequenceInputStream sin = new SequenceInputStream(in,in2);
        FileOutputStream fout = new FileOutputStream("ag3.txt");
        int i=0;
        while((i=sin.read())!=-1){
            //System.out.print((char)i);
            fout.write((char)i);
        }
    }
}
