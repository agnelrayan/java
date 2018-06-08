package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegEx6 {
    public static void main(String[] args) {
        //System.out.println(Pattern.matches("[amn]","abcd"));//false(not a or m or n)
        System.out.println(Pattern.matches("[amn]","a"));//true(among a or m or n)
        //System.out.println(Pattern.matches("[amn]","ammmna"));//false(m and a comes more than one)
        System.out.println(Pattern.matches("[^abc]","e"));//true
        //System.out.println(Pattern.matches("[^abc]","ef"));//false
        System.out.println(Pattern.matches("[a-zA-Z]","1"));//false
        System.out.println(Pattern.matches("[a-zA-Z]","ab"));//false
        System.out.println(Pattern.matches("[a-zA-Z]","A"));//true
        System.out.println(Pattern.matches("[a-d[m-p]]","f"));//false
        System.out.println(Pattern.matches("[a-d[m-p]]","d"));//true
       // System.out.println(Pattern.matches("[a-z&&[def]]","da"));
        System.out.println(Pattern.matches("[a-z&&[^bc]]","a"));//true
        System.out.println(Pattern.matches("[a-z&&[^bc]]","c"));//false
        System.out.println(Pattern.matches("[a-z&&[^m-p]]","a"));//true
        System.out.println(Pattern.matches("[a-z&&[^m-p]]","o"));//false


    }
}

