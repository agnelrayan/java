package com.expertzlab.filehandling;

import java.io.File;

/**
 * Created by geo on 9/10/17.
 */
public class CreateFileEx {
    public static void main(String[] args) throws Exception{
        File file = new File("ag445.txt");
        boolean i=file.createNewFile();
        //System.out.println(file.length());

        if(i==true)
          System.out.println("File is created");
        else
          System.out.println(" Already exists");


    }

}
