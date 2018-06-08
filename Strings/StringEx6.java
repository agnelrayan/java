package com.expertzlab.Strings;


public class StringEx6 {
    public static void main(String[] args) {
        String s ="agnel";
       // s=s.concat("rayan");
        System.out.println(s);

        String s2="agnel";
        String s3 = new String("agnel");
        String s4 ="rayan";

        System.out.println(s.equals(s2));//true
        System.out.println(s.equals(s3));//true
        System.out.println(s.equals(s4));//false
    }
}
