package com.expertzlab.sample2.fileex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by agnel on 5/15/18.
 */
public class Fseek {
    public static void main(String[] args) throws IOException {
        // create a new RandomAccessFile with filename test
        RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
        raf.seek(3);
        long file=raf.getFilePointer();
        System.out.println(file);






    }
}
