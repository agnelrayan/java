package com.expertzlab.sample2.fileex;

import java.io.ByteArrayOutputStream;

/**
 * Created by agnel on 5/16/18.
 */
public class ByteArrayOS2 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for(int i=0;i<10;i++){
            baos.write((byte)(Math.random()*100));
        }

        byte[] byteArray = baos.toByteArray();
        for(byte b: byteArray)
            System.out.println(b+" ");

        for(byte i=0;i<5;i++){
            baos.write(i);

            byte[] ii = baos.toByteArray();
            for(byte ib : ii)
                System.out.println(ib+"");

        }
    }



}
