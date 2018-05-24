package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class EndsWithEx {
    public static void main(String[] args) {
        String str ="God is our hope";
        boolean result=str.endsWith("hope");
        System.out.println(result);//true

        boolean result2 = str.endsWith("our");
        System.out.println(result2);//false

        boolean result3 = str.endsWith("pe");
        System.out.println(result3);//true
    }
}
