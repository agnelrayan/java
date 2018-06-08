package com.expertzlab.ExceptionHandlingEx;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by agnel on 6/8/18.
 */
public class ThrowsExs {
    public static void main(String[] args) throws Exception {

            FileOutputStream fout = new FileOutputStream("file");
            String str="Welcome to Java File";
            fout.write(str.getBytes());
            FileInputStream fin = new FileInputStream("file");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }



        }
    }

