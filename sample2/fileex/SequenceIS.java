package com.expertzlab.sample2.fileex;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 * Created by agnel on 5/17/18.
 */
public class SequenceIS {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("file1.txt",true);
        FileOutputStream fout2 = new FileOutputStream("file2.txt",true);
        FileOutputStream fout3 = new FileOutputStream("file3.txt");

        //String str = "Writing into the file1...";
        //String str2 = "Writing into the file2...";
        String str3 = "We Trust in God";

     //   byte[] byteStr = str.getBytes();
     //   byte[] byteStr2 = str2.getBytes();
        byte[] byteStr3 = str3.getBytes();

      //  fout.write(byteStr);
      //  fout2.write(byteStr2);

       /* FileInputStream fin = new FileInputStream("file1.txt");
        FileInputStream fin2 = new FileInputStream("file2.txt");

        SequenceInputStream seq = new SequenceInputStream(fin,fin2);
        int i=0;
        while((i=seq.read())!=-1){
            //System.out.print((char)i);
            fout3.write((char)i);
        }*/

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(byteStr3);
        baos.writeTo(fout);
        baos.writeTo(fout2);
        baos.writeTo(fout3);

        System.out.println("Successfully is written in Multiple files..");





    }
}
