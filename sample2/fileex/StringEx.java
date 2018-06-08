package com.expertzlab.sample2.fileex;

/**
 * Created by agnel on 5/15/18.
 */
public class StringEx {
    public static void main(String[] args) {
        String str ="java";
        String str2 = "java";
        String str3 = new String("java");
        System.out.println(str2.equals(str3));//true
        System.out.println(str2==str3);//false
        System.out.println(str==str2);//true
    }
}
