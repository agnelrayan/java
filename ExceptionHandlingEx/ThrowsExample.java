package com.expertzlab.ExceptionHandlingEx;


import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = null;
        fis = new FileInputStream("ab.txt");
        int k;

        while(( k = fis.read() ) != -1)
        {
            System.out.print((char)k);
        }
        fis.close();
    }
}
