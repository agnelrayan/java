package com.expertzlab.sample2.fileex;

import java.io.File;

/**
 * Created by agnel on 5/14/18.
 */
public class FileEx2 {
    public static void main(String[] args) {
        File f = new File("/home/agnel/ag/output3");
        String[] fn = f.list();
        for(String fi:fn){
            System.out.println(fi);
        }

    }
}
