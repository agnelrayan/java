package com.expertzlab.sample2.fileex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * Created by agnel on 5/16/18.
 */
public class AvailableEx {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("xy.txt");
        String str ="hivehq hjhj jjh jhhj jh jh jh jhl";
        byte[] byteStr = str.getBytes();

        out.write(byteStr);
        System.out.println("success");

        FileInputStream in = new FileInputStream("xy.txt");
        int i=in.available();
        System.out.println("i = " + i);

        BufferedInputStream bin = new BufferedInputStream(in);
        int i2=bin.available();
        System.out.println("I2:"+i2);
        boolean i3=bin.markSupported();
        System.out.println("I3:"+i3);
        bin.mark(10);

        FileReader fr = new FileReader("xy.txt");
        bin.reset();

        
    }
}
