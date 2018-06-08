package com.expertzlab.filehandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by geo on 11/10/17.
 */
public class InputStreamReaderEx3 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("ag4.txt");
        Reader reader = new InputStreamReader(in);
        int i =0;
        while((i=reader.read())!=-1){
            System.out.print((char)i);
        }

    }
}
