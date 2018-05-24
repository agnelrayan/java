package com.expertzlab.sample2;

import java.util.regex.Pattern;

/**
 * Created by agnel on 5/16/18.
 */
public class StringEx6 {
    public static void main(String[] args) {
        //String name="Lord I trust in You,You are our Source Lord";
        String no ="9977558844df";
        boolean yn = Pattern.matches("\\d{10}",no);
                if(yn==true)
                    System.out.println("Mobile Number");
                else
                    System.out.println("Not Mobile Number");

    }
}
