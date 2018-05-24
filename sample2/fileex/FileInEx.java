package com.expertzlab.sample2.fileex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by agnel on 5/10/18.
 */
public class FileInEx {
    public static void main(String[] args) throws IOException{

            InputStream fin = new FileInputStream("ag.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);

            }

    }

}
