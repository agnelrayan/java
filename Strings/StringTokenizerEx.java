package com.expertzlab.Strings;

import java.util.StringTokenizer;

/**
 * Created by geo on 4/10/17.
 */
public class StringTokenizerEx {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("Welcome to Java");
        while(str.hasMoreTokens()){
            //System.out.println(str.nextElement());
            System.out.println(str.nextToken());
            System.out.println("Count Tokens"+str.countTokens());

        }
    }
}
