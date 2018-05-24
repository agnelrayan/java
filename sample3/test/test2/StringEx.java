package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/21/18.
 */
public class StringEx {
    public static void main(String[] args) {
        String str=new String("java");
        String str2 = new String("java");
        String str3="java";
        String str4="java";
        System.out.println("Str.equals:"+str.equals(str2));//true
        System.out.println("Str==str2:"+str==str2);//false
        System.out.println(str3==str4);//true
        System.out.println("STr==str3:"+str==str3);//false
            }
}
