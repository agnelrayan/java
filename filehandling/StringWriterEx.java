package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 * Created by geo on 9/10/17.
 */
public class StringWriterEx {
    public static void main(String[] args) throws Exception{
        char ar[] = new char[255];
        StringWriter sw = new StringWriter();
        FileInputStream fin = new FileInputStream("af.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin,"UTF-8"));

        /*FileInputStream input = null;
        BufferedReader buffer = null;
        input = new FileInputStream("D://testout.txt");
        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));*/

        int i=0;
        while((i=br.read())!=-1){
            System.out.println((char)i);
            sw.write(ar,0,i);
        }
        System.out.print(sw.toString());
        sw.close();
        br.close();
    }
}
