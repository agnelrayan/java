package com.expertzlab.sample2.fileex;

import org.apache.derby.iapi.services.io.AccessibleByteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * Created by agnel on 5/16/18.
 */
public class ByteArrayOS {
    public static void main(String[] args) throws Exception{
        FileOutputStream out1 = new FileOutputStream("agn1.txt",true);
        FileOutputStream out2 = new FileOutputStream("agn2.txt",true);
        FileOutputStream out3 = new FileOutputStream("agn3.txt",true);
        String str ="We trust in God";
        byte[] byteStr = str.getBytes();


        //out1.write(byteStr);
        //out2.write(byteStr2);

        ByteArrayOutputStream baos = new ByteArrayOutputStream() ;
        baos.write(byteStr);
        baos.writeTo(out1);
        baos.writeTo(out2);
        baos.writeTo(out3);

        System.out.println(baos);

    }
}
