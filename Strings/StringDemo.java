package com.expertzlab.Strings;


public class StringDemo {
    public static void main(String[] args) {
        String str ="Iavas";
        String str2 ="Java";
        String str3 = new String("Java");

        //System.out.println(str.equals(str2));//true
       // System.out.println(str.equals(str3));//true
       // System.out.println(str==str2);//true
      //  System.out.println(str==str3);//false
      //  System.out.println(str.hashCode());
      //  System.out.println(str3.hashCode());

        int i=str.compareTo(str2);
        System.out.println(i);//0

        boolean result = str.contains("God");
        System.out.println(result);//false
    }


}
