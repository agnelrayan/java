package com.expertzlab.filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class FileDemo5 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("xyz.txt");
        FileOutputStream fout2 = new FileOutputStream("ijk.txt");
        String str ="welcome to file";
        byte[] bytes = str.getBytes();

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
       // fout.write(bytes);
        //fout2.write(bytes)
        bout.writeTo(fout);
        bout.writeTo(fout2);

    }
}
