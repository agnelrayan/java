package com.expertzlab.sample2.fileex;

import java.io.*;

public class Fseek2 {

    public static void main(String[] args) {

        try {

            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");

            // write something in the file
            raf.writeUTF("Hello World All is good");

            // set the file pointer at 0 position
            raf.seek(0);

            // print the string
            System.out.println("" + raf.readUTF());

            // set the file pointer at 5 position
            raf.seek(2);

            // write something in the file
            raf.writeUTF("This is an example");

            // set the file pointer at 0 position
            raf.seek(0);

            // print the string
            System.out.println("" + raf.readUTF());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}