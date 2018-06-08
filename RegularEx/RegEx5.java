package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegEx5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));//true
        System.out.println(Pattern.matches(".s","mk"));//false
        System.out.println(Pattern.matches(".s","mst"));//false(has more than 2 char)
        System.out.println(Pattern.matches(".s","amms"));//false
        System.out.println(Pattern.matches("..s","mas"));//true
        System.out.println(Pattern.matches("s","s"));

    }
}
