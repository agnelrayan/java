package com.expertzlab.Strings;


public class StringDemo2 {
    public static void main(String[] args) {
        String obj = "Java";
        obj.concat("Programming");
        System.out.println(obj);

        StringBuffer obj2 = new StringBuffer("Java");
        obj2.append("Programming");
        System.out.println(obj2);

        StringBuilder obj3 = new StringBuilder("Java");
        obj3.append("Programming");
        System.out.println(obj3);

    }
}
