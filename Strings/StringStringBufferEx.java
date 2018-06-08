package com.expertzlab.Strings;

public class StringStringBufferEx{
    public static void main(String args[]){
        System.out.println("Hashcode test of String:");
        String str="java";
        System.out.println(str.hashCode());
        str=str+"welcome";
        System.out.println(str.hashCode());
       // str=str+"helo";
       // System.out.println(str.hashCode());

        String str2 = "javawelcome";
        System.out.println(str2);

        boolean result =str2.equals(str);
        System.out.println(result);
        System.out.println("Hashcode for String"+str.hashCode());
        System.out.println("Hashcode for String2"+str2.hashCode());

        boolean result2=(str2==str);
        System.out.println(result2);




        /*System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb=new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("welcome");
        System.out.println(sb.hashCode());
        sb.append("helo");
        System.out.println(sb.hashCode());*/
    }
}