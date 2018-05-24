package com.expertzlab.Strings;

/**
 * Created by agnel on 3/5/18.
 */
public class StringTest {
    public static void main(String[] args) {
        char ch[] ={'j','a','v','a'};
        String str = new String(ch);
        System.out.println(str);

        String str2 ="java";
        String str3 ="java";
        String str4 = new String("java");
        System.out.println(str2==str3);//true
        System.out.println(str==str4);//false
        System.out.println(str.equals(str4));//true


    }
}
