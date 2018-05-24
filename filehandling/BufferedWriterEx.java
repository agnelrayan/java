package com.expertzlab.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created by geo on 9/10/17.
 */
public class BufferedWriterEx {
    public static void main(String[] args) throws Exception{
        FileWriter file = new FileWriter("agn6.txt");
        BufferedWriter bw = new BufferedWriter(file);
        bw.write("Write into Agn6.txt using BufferedWriter Class");
        bw.close();
        file.close();
        System.out.println("It is written");
    }
}
