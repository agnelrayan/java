package com.expertzlab.filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MkdirEx2 {

    public static void main(String[] args) throws Exception,FileNotFoundException
    {

        File file = new File("/home/geo/Desktop/agnew");
        FileOutputStream fout = new FileOutputStream("/home/geo/Desktop/agnew/ag.txt");

        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory is created!");
            } else {
                System.out.println("Failed to create directory!");
            }
        }

        File files = new File("/home/geo/Desktop/agnew2/ag2.txt");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        }


    }

}
