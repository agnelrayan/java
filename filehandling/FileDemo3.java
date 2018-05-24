package com.expertzlab.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo3 {
    public static void main(String[] args) throws IOException,RuntimeException{
try {

    OutputStream fout = new FileOutputStream("abc123.txt");
    String str = null;
    byte[] byteStr = str.getBytes();
    fout.write(byteStr);
    System.out.println("It is written successfully..");

}
catch(Exception e){
    System.out.println(e);
}
        }
    }

