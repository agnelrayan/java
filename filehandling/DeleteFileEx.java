package com.expertzlab.filehandling;

import java.io.File;

/**
 * Created by geo on 9/10/17.
 */
public class DeleteFileEx {
    public static void main(String[] args) {
        File file = new File("ag3.txt");
        boolean delete = file.delete();
        System.out.println("File is deleted:"+delete);
    }
}
