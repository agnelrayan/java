package com.expertzlab.Strings;

public class StringEx9 {
    public static void main(String[] args) {

        //substring
        String str="agnelrayan";
        System.out.println(str.substring(0,5));//agnel
        System.out.println(str.substring(2));//lrayan


        //uppercase & lower case letter
        System.out.println(str.toUpperCase());//AGNELRAYAN
        System.out.println(str.toLowerCase());//agnelrayan

        //trim method
        String str2 ="   agnel  ";
        System.out.println(str2);
        System.out.println(str2.trim());

        //startswith and endswith
        String str3 = "agnel";
        System.out.println(str3.startsWith("b"));//true
        System.out.println(str3.endsWith("l"));//true

        //charAt Method
        String str4="agnel";
        System.out.println(str4.charAt(0));//a
        System.out.println(str4.charAt(2));//n
        System.out.println(str4.length());//5


        /*
        string intern() method is used to create an exact copy of heap string object in string constant pool.
        The string objects in the string constant pool are automatically interned but string objects in heap are not.
         */
        //intern() method
        String str5="agnel";
        String str6 = new String("agnel");
        System.out.println(str5.equals(str6));//true
        System.out.println(str5==str6);//false

        str6=str6.intern();
        System.out.println(str5==str6);//true

        //replace() method
        String str7="agnel rayan";
        String str8 = str7.replace("agnel","anto");
        System.out.println(str8);//anto rayan


    }
}
