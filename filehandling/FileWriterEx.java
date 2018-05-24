package com.expertzlab.filehandling;

import java.io.*;

/**
 * Created by geo on 9/10/17.
 */
public class FileWriterEx {
    public static void main(String[] args) throws Exception{
        String fileName = "/home/geo/Desktop/agn5.txt";
        FileWriter fw = new FileWriter(fileName);
        BufferedWriter bw = new BufferedWriter(fw);
        //Writer fw = new FileWriter("agn5.txt",true);
        bw.write("Yes, We are Agree. We are Agree too.");
        bw.write("Lord, We are your people");
        bw.write("We depend on you");
        bw.write(65);
        bw.close();
        System.out.println("Successfully It is written");
        //Reader fr = new FileReader("agn5.txt");
        BufferedReader br = new BufferedReader(new FileReader("agn5.txt"));
        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }


    }
}
