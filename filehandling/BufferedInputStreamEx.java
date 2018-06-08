package com.expertzlab.filehandling;

import java.io.*;
import java.util.Date;

/**
 * Created by geo on 9/10/17.
 */
public class BufferedInputStreamEx {
    public static void main(String[] args) throws Exception{

       // long startTime = System.currentTimeMillis();


        long startTime = new Date().getTime();

        FileInputStream fos = new FileInputStream("ag6.txt");
        FileInputStream fos2 = new FileInputStream("ag8.txt");
        SequenceInputStream sin = new SequenceInputStream(fos,fos2);
        BufferedInputStream bin  = new BufferedInputStream(sin);
         BufferedOutputStream bout= new BufferedOutputStream(new FileOutputStream("ag44.txt"));
        FileOutputStream fout = new FileOutputStream("ag44.txt");
        BufferedOutputStream boutt = new BufferedOutputStream(fout);
        int i=0;
         while((i=bin.read())!=-1){
            System.out.print((char)i);
            boutt.write((char)i);
                    }
        System.out.println("----");
        long endTime = new Date().getTime();
        System.out.println("elapsed milliseconds: " + (endTime - startTime));

        /*long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);*/

    }
}
