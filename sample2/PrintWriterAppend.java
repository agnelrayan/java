package com.expertzlab.sample2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by agnel on 5/14/18.
 */
public class PrintWriterAppend {
    public static void main(String[] args) {
        try{

            File file = new File("abd.txt");
            if(!file.exists()){
                file.createNewFile();

                            }

                            FileWriter fw = new FileWriter(file,true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            pw.print("hi how do u do");
                            pw.print("fine, all is well");
                            pw.print("all is well");

            System.out.println("Successfully appended...");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
