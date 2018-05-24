package com.expertzlab.filehandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("agn3.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        /*
        String str = "Welcome to DataOutput Stream";
        byte[] bytes = str.getBytes();

        dos.write(bytes);*/

        dos.writeInt(65);
        dos.writeBytes("hw do you do?");
        dos.writeChar('a');
        dos.write(65);

        System.out.println("It is Successfully written");
    }
}
