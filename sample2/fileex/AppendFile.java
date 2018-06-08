package com.expertzlab.sample2.fileex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by agnel on 5/14/18.
 */
public class AppendFile {
    public static void main(String[] args) {
        try{

            String str="This is my content, Hope all is fine";
            File f = new File("abc.txt");

            if(!f.exists())
            {
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            System.out.println("Data is Appended Successfully..");
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
