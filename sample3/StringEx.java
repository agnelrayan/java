package com.expertzlab.sample3;

/**
 * Created by agnel on 5/24/18.
 */
public class StringEx {
    public static void main(String[] args) {
        String str="HI";
        String str2="java";
        String str3 =new String("Hi");
        String str4 =new String("java");
        str3.concat(",All is fine");
        //System.out.println(str3);//java
       // System.out.println(str2.concat("j2ee"));//java

        /*System.out.println(str==str2);//true
        System.out.println(str3==str4);//false
        System.out.println(str==str3);//false
        System.out.println(str.equals(str2));//true
        System.out.println(str3.equals(str4));//true*/


        System.out.println(str3);

        StringBuffer strbuf = new StringBuffer("Hi");
        strbuf.append("Hw do you do?");
        System.out.println(strbuf);

        StringBuilder strbuild = new StringBuilder("HI");
        strbuild.append(",All is fine");


        System.out.println(strbuild);



    }
}
