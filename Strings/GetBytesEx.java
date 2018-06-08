package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class GetBytesEx {
    public static void main(String[] args) {

        String str2="abc";
        byte[] bytes = str2.getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }


        //System.out.println(str2.getBytes());

        String str3 ="ABC";
        byte[] byte2 = str3.getBytes();

        for(int i=0;i<byte2.length;i++)
            System.out.println(byte2[i]);

    }
}
