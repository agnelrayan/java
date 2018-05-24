package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by geo on 9/10/17.
 */
public class BufferedReaderEx {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("agn5.txt");
        BufferedReader br = new BufferedReader(file);

        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        file.close();
        System.out.println("It has read");
    }
}
