package com.expertzlab.filehandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 * Created by geo on 9/10/17.
 */
public class FilterInputStreamEx {
    public static void main(String[] args) throws Exception{
        File file = new File("agn4.txt");
        FileInputStream fin = new FileInputStream(file);
        FilterInputStream fil = new BufferedInputStream(fin);

        int i =0;
        while((i=fil.read())!=-1){
            System.out.print((char)i);
        }
    }
}
