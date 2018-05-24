package com.expertzlab.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by geo on 18/1/18.
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("myfile");
        BufferedInputStream bin = new BufferedInputStream(in);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);

        }
    }
}
