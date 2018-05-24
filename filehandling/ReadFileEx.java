package com.expertzlab.filehandling;

import java.io.*;

/**
 * Created by geo on 9/10/17.
 */
public class ReadFileEx {
    public static void main(String[] args) throws Exception{
        File file = new File("ag2.txt");

        FileReader fin = new FileReader(file);
       // InputStreamReader fw = new FileWriter(file);

        BufferedReader br = new BufferedReader(fin);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
