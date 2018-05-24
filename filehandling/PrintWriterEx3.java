package com.expertzlab.filehandling;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by geo on 9/10/17.
 */
public class PrintWriterEx3 {
    public static void main(String[] args) throws Exception{
        String file ="abc124.txt";
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        String sentence="This is the day Lord God has made";
        for(int i=0;i<sentence.length();i++){
            pw.write(sentence.charAt(i));
            pw.write('\n');
        }
        pw.close();

    }
}
