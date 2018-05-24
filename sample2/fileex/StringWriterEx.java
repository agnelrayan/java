package com.expertzlab.sample2.fileex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

/**
 * Created by agnel on 5/16/18.
 */
public class StringWriterEx {
    public static void main(String[] args) throws Exception{
        char[] ar = new char[512];

        StringWriter wr = new StringWriter();

        FileInputStream fin = new FileInputStream("ag.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fin,"UTF-8"));

        int x;
        while((x=br.read(ar))!=-1){
            wr.write(ar,0,x);
        }
        System.out.println(wr.toString());
    }
}
