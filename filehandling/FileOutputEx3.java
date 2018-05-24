package com.expertzlab.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by geo on 11/10/17.
 */
public class FileOutputEx3 {
public static void main(String[]args)throws Exception{
    FileInputStream fin = new FileInputStream("/home/geo/Desktop/new.txt");
    FileOutputStream fout = new FileOutputStream("ag44.txt");
    int i=0;
    while((i=fin.read())!=-1){
        fout.write((byte)i);
    }

        }
}
