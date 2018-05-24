package com.expertzlab.filehandling;

import java.io.*;

public class FileOPSEx {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        FileOutputStream out = new FileOutputStream("sample2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(out);
        String str ="We trust in you Lord";

        byte[] bytes=str.getBytes();
        bout.write(bytes);
        System.out.println("Successfully is written");
        bout.close();

        //FileInputStream in = new FileInputStream("sample2.txt");
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("sample2.txt"));
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }

    }
}
