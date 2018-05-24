package com.expertzlab.Strings;
public class StringEx8 {
    public static void main(String[] args) {
        String str="agnel";
        String str2 ="agnel";
        String str3="Balan";
        System.out.println(str.compareTo(str2));//0
        System.out.println(str.compareTo(str3));// positive
        System.out.println(str3.compareTo(str));//negative
    }
}
