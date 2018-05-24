package com.expertzlab.filehandling;

import java.io.FileReader;
import java.io.Reader;

/**
 * Created by geo on 9/10/17.
 */
public class ReaderEx {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("agn4.txt");
        int i=0;
        while((i=reader.read())!=-1){
            System.out.print((char)i);

        }
        reader.close();
    }
}
