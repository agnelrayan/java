package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class InternEx {
    public static void main(String[] args) {
        String str="helo";
        String str2 = new String("helo");

        boolean result = str.equals(str2);
        System.out.println(result);//true

        boolean result2 = (str==str2);
        System.out.println(result2);//false

        String str3 = str2.intern();

        boolean result3 =(str==str3);
        System.out.println(result3);//true
    }
}
