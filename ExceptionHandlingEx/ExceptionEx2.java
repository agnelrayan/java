package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionEx2 {
    public static void main(String[] args) throws IOException{

            //FileWriter fw = new FileWriter("sample.txt");
            //fw.write("I am the way, truth and the life");
            //fw.close();

            FileReader fr = new FileReader("sample.txt");
            int i=0;
            while((i=fr.read())!=-1) System.out.print((char) i);

    }
}