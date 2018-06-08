package com.expertzlab.Strings;

/**
 * Created by agnel on 3/5/18.
 */
public class StringTest4 {
    public static void main(String[] args) {
        int a=10;
        float f =50f;
        String s = "AG";
        String str=String.format("%d %f %s",a,f,s);
        System.out.println(str);
    }
}
