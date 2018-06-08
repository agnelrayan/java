package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringValueOfEx {
    public static void main(String[] args) {
        int i=10;
        String str = String.valueOf(i);
        System.out.println(str);//10

        System.out.println(str+20);//1020

        float f=34f;
        String str2 = String.valueOf(f);
        System.out.println(str2+"Ag");
    }
}
