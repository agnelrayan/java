package com.expertzlab.sample2.fileex;

import java.io.RandomAccessFile;

/**
 * Created by agnel on 5/17/18.
 */
public class RandomEx {
    public static void main(String[] args) throws Exception{
        RandomAccessFile r = new RandomAccessFile("random.txt","rw");
        r.writeUTF("All is fine how is every");
        r.seek(0);
        System.out.println(r.readUTF());
        r.seek(3);
        r.writeUTF("How do you do");
        r.seek(0);
        System.out.println(r.readUTF());
    }
}
