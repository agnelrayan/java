package com.expertzlab.sample2.fileex;

import java.io.*;

public class Test{
    public static void main(String[] args){
        new Test().run();
    }

    public void run(){
        try{
            RandomAccessFile f = new RandomAccessFile("abc.txt","r");
            f.seek(6L);
            System.out.println("Before InputStream, f at "+f.getFilePointer());
            InputStream s = new FileInputStream(f.getFD());
            for(int i=0;i<3;i++){
                System.out.println((char)s.read());
            }
            System.out.println("After InputStream, f at "+f.getFilePointer());
            f.seek(6L);
            System.out.println("Before InputStream, f at "+f.getFilePointer());
            s = new FileInputStream(f.getFD());
            for(int i=0;i<3;i++){
                System.out.println((char)s.read());
            }
            System.out.println("After InputStream, f at "+f.getFilePointer());
        }catch(IOException e){
            System.out.println(e.getClass().getName()+": "+e.getMessage());
        }
    }
}