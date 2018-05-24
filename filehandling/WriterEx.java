package com.expertzlab.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by geo on 9/10/17.
 */
public class WriterEx {
    public static void main(String[] args) throws Exception {
        Writer file = new FileWriter("agn5.txt");
       String str="Writing using File Writer";
        file.write(str);

        // file.write("Writing using File Writer");
        file.close();
        System.out.println("It is written successfully");
    }

}
