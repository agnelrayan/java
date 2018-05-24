package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class EqualIgnoreEx {
    public static void main(String[] args) {
        String str ="Welcome";
        String str2 ="WELCOME";

        boolean result=str.equalsIgnoreCase(str2);
        boolean result2 = str.equals(str2);

        System.out.println(result);//true
        System.out.println(result2);//false
    }
}
