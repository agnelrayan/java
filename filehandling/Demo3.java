package com.expertzlab.filehandling;


import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("myfile2");
        BufferedWriter br = new BufferedWriter(fw);
        br.write("Welcome to Java");
        System.out.println("It is written Successfully");
        br.close();

        Reader fr = new FileReader("myfile2");
        BufferedReader bw = new BufferedReader(fr);
        int i;
        while((i=bw.read())!=-1){
            System.out.print((char)i);

        }
        bw.close();


    }
}
