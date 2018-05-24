package com.expertzlab.sample2.fileex;

import java.io.File;
import java.io.IOException;

/**
 * Created by agnel on 5/14/18.
 */
public class FileEx {
    public static void main(String[] args) {
        try{
            File file = new File("abc.txt");
            if(file.createNewFile()){
                System.out.println("New File is Created...");
            }
            else
            {
                System.out.println("File Already is exist...");
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
