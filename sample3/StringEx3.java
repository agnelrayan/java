package com.expertzlab.sample3;

/**
 * Created by agnel on 5/24/18.
 */
public class StringEx3 {
    public static void main(String[] args) {
        String str ="Big Data";
        char[] ch = new char[10];

        str.getChars(0,8,ch,0);
        System.out.println(ch);
        System.out.println(str.hashCode());//integer value
        System.out.println(str.indexOf('D'));
    }
}
