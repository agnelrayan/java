package com.expertzlab.filehandling;

import java.io.*;

class FileInOut {

    public static void main(String args[])throws Exception{

        InputStream obj = new FileInputStream("/home/geo/Test2/src/main/java/com/expertzlab/filehandling/FileInOut.java");

        System.out.print(obj.available());

    }

}