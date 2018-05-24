package com.expertzlab.sample2.fileex;

import java.io.ByteArrayInputStream;

/**
 * Created by agnel on 5/16/1= 8.
 */
public class ByteArrayIS {
    public static void main(String[] args) {
        byte[] bytes ={10,50,60,70,80};
        ByteArrayInputStream bin =new ByteArrayInputStream(bytes);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.println(i);
        }
    }
}
