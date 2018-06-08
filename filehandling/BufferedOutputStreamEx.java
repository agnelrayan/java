package com.expertzlab.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * Created by geo on 9/10/17.
 */
public class BufferedOutputStreamEx {
    public static void main(String[] args)throws Exception {
       // FileOutputStream fos = new FileOutputStream("ag6.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ag6.txt"));
        String str="Write content by BufferedOutput Stream";

        byte[] byteStr = str.getBytes();
        bos.write(byteStr);
        //bos.flush();
        //fos.close();
         bos.close();

    }
}
