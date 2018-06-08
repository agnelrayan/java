package com.expertzlab.Strings;

/**
 * Created by geo on 28/9/17.
 */
public class ReverseStringEx {
    public static void main(String[] args) {
        String str ="Welcome";
        char[] charArray=str.toCharArray();

        for(int i =charArray.length-1;i>=0;i--) {
            System.out.println(charArray[i]);
        }

    }
}
