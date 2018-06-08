package com.expertzlab.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

/**
 * Created by geo on 9/10/17.
 */
public class FilterOutputStreamEx {
    public static void main(String[] args) throws Exception{
        File file = new File("agn4.txt");
        FileOutputStream fos = new FileOutputStream(file);
        FilterOutputStream fil = new FilterOutputStream(fos);

        String str="In Filter Output Stream";
        byte[] bytes = str.getBytes();

        fil.write(bytes);

        fil.close();
        fos.close();

        System.out.println("It is written completed");


    }
}
