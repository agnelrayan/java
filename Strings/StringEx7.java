package com.expertzlab.Strings;

public class StringEx7 {
    public static void main(String[] args) {
        String str ="agnel";
        String str2 ="agnel";
        String str3 = new String("agnel");
        String str4 =new String("agnel");

        System.out.println(str==str2);//true
        System.out.println(str==str3);//false
        System.out.println(str3==str4);//false
        System.out.println(str3==str3);//true
    }

}
