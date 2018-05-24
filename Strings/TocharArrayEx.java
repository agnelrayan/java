package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class TocharArrayEx {
    public static void main(String[] args) {
        String str="welcome";
        char ch[]=str.toCharArray();

        for(int i=0;i<=ch.length-1;i++)
            System.out.println(ch[i]);
    }
}
