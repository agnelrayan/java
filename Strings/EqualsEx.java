package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class EqualsEx {
    public static void main(String[] args) {
        String str ="abc";
        String str2 ="abc";
        String str3 = "ABC";
        String str4 ="EFG";

        boolean result=str.equals(str2);
        System.out.println(result);//true

        boolean result2 = str.equals(str3);
        System.out.println(result2);//false

        boolean result3 = str.equals(str4);
        System.out.println(result3);//false

    }
}
