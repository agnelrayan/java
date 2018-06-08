package com.expertzlab.sample2.fileex;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Created by agnel on 5/14/18.
 */
public class LastModified {
    public static void main(String[] args){
        File f = new File("abd.txt");
        SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");
        System.out.print(dt.format(f.lastModified()));


    }
}
