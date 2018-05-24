package com.expertzlab.Collections.HashcodeEqualsMethodEx;


public class Sample2 {
    public static void main(String[] args) {
        String s = new String("h234");
        String s2 = new String("h234");
        System.out.println(s.equals(s2));//true

        Emp s3 = new Emp(1,"1234");
        Emp s4 = new Emp(1,"1234");
        System.out.println(s3.equals(s4));//true

       /* String str =null;
        System.out.println(str.hashCode());*/
    }
}
