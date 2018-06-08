package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegExQuantifier {
    public static void main(String[] args) {

        System.out.println("?Quantifier..........");
      //  System.out.println(Pattern.matches("[x?]","x"));
      //  System.out.println(Pattern.matches("[x?]","x"));
        System.out.println(Pattern.matches("[amn]?","a"));//true
        System.out.println(Pattern.matches("[amn]?","aaa"));//false
        System.out.println(Pattern.matches("[amn]?","amnamn"));//false
        System.out.println(Pattern.matches("[amn]?","n"));//true

        System.out.println("+Quantifier........");
        System.out.println(Pattern.matches("[amn]+","amnamn"));//true
        System.out.println(Pattern.matches("[amn]+","aaa"));//true
        System.out.println(Pattern.matches("[amn]+]","ata"));//false

        System.out.println("*Quantifier.....");
        System.out.println(Pattern.matches("[amn]*","ammmna"));//true


    }
}
