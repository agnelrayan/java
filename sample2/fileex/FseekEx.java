package com.expertzlab.sample2.fileex;

import java.io.RandomAccessFile;

/**
 * Created by agnel on 5/14/18.
 */
public class FseekEx {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rn = new RandomAccessFile("abc.txt","rw");
        rn.writeUTF("hi hw do you do");
        rn.seek(1);
        System.out.println(rn.readUTF());
        rn.seek(4);
        System.out.println(rn.readUTF());
    }
}
