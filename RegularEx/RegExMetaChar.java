package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegExMetaChar {
    public static void main(String[] args) {
        System.out.println("MetaCharacters d...");

        System.out.println(Pattern.matches("\\d","abc"));//false (non-digit)
        System.out.println(Pattern.matches("\\d","2"));//true(digit and comes once)
        System.out.println(Pattern.matches("\\d","332"));//false (digit but comes more than once)
        System.out.println(Pattern.matches("\\d","33ab"));//false (digit and char)

        System.out.println("Metacharacters D...");//D means non - digit
        System.out.println(Pattern.matches("\\D","1"));//false (digit)
        System.out.println(Pattern.matches("\\D","dfd1"));//false (digit and char)
        System.out.println(Pattern.matches("\\D","m"));//true (non digit and comes once)

        System.out.println("MetaCharacters D with quantifier");
        System.out.println(Pattern.matches("\\D*","mak"));//true (non-digit and may come 0 or more times)
        System.out.println(Pattern.matches("\\D*","mak3"));//false (digit is not allowed)

    }
}
