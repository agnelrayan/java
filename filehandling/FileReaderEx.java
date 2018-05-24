package com.expertzlab.filehandling;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("agn4.txt");
        //file.read();

        int i=0;
        while((i=file.read())!=-1){
            System.out.print((char)i);
        }
    }
}
