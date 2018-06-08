package com.expertzlab.sample2.fileex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by agnel on 5/10/18.
 */
public class FileIn {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("a.txt");
       // int i=0;
        int i=fin.read();
        System.out.print((char)i);
      /*  while((i=fin.read())!=-1){
            System.out.print((char)i);
        }*/
    }
}
