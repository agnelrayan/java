package com.expertzlab.Strings;

public class StringEx14 {
    public static void main(String[] args) {
        String str ="helo";
        String str2 ="HELO";
        String str3 = new String("helo");
        String str4 ="hi";
        String str5 = new String("helo");
        System.out.println(str.equalsIgnoreCase(str2));//true
        System.out.println(str.equalsIgnoreCase(str3));//true
        System.out.println(str==str2);//true
        System.out.println(str==str3);//false

        String str6 ="abc";
        String str7 = "abc";
        System.out.println("Comparing str6 & str7:"+str6.compareTo(str7));


        //System.out.println(str3==str5);//false
       // System.out.println(str3==str3);//true
        /*System.out.println("Hashcode of str:"+str.hashCode());
        System.out.println("Hashcode of str:"+str2.hashCode());
        System.out.println("Hashcode of str3:"+str3.hashCode());
        System.out.println("Hashcode of str5:"+str5.hashCode());*/

    }
}
