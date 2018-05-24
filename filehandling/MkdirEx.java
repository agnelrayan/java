package com.expertzlab.filehandling;

import java.io.File;

public class MkdirEx {

    public static void main(String[] args) {
        File f = null;
        boolean bool = false;

        try {

            // returns pathnames for files and directory
            f = new File("/MkdirText/abc.txt");

            // create
            bool = f.mkdir();

            // print
            System.out.print("Directory created? "+bool);

        } catch(Exception e) {

            // if any error occurs
            e.printStackTrace();
        }
    }
}