package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class ReplaceEx {
    public static void main(String[] args) {
        String str = "how do you do?";
        String str2 = str.replace("do","doe");
        System.out.println(str);
        System.out.println(str2);

        String str3 = str.replace('o','e');
        System.out.println(str3);

        String str4 = str.replaceAll("e","o");
        System.out.println(str4);
    }
}
