package com.expertzlab.filehandling;

import com.google.common.io.FileBackedOutputStream;
import org.apache.hadoop.fs.BufferedFSInputStream;

import java.io.*;

/**
 * Created by agnel on 6/1/18.
 */
public class FileDem {
    public static void main(String[] args) throws IOException{
        File file = new File("file.txt");
        //FileOutputStream fout = new FileOutputStream(file);
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file));
        String str = "Welcome to Java File";
        byte[] strByte=str.getBytes();
        bout.write(strByte);
        System.out.println("Success...");
        bout.flush();
        bout.close();

        FileInputStream fin = new FileInputStream("file.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);

        }
    }
}
