package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringFormatEx {
    public static void main(String[] args) {
        String str = "Ag";
        int i=90;
        float f =100.8932f;

        System.out.println(String.format("%s %d %.3f",str,i,f));

        /*
        String str2="aBc";
        byte[] bytes = str2.getBytes();
        for(int ii=0;ii<bytes.length;ii++){
            System.out.println(bytes[ii]);
        }*/


        //System.out.println(str2.getBytes());
    }
}
