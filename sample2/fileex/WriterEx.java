package com.expertzlab.sample2.fileex;

import java.io.*;

/**
 * Created by agnel on 5/17/18.
 */
public class WriterEx {
    public static void main(String[] args) throws Exception {
        FileWriter wr = new FileWriter("newfile.txt");
        BufferedWriter bw = new BufferedWriter(wr);
        String str = " All is Fine";
        bw.write(str);
        System.out.println("Successs...");

     //   wr.close();

        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));

        int i=0;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }

        //wr.close();
    }
}
