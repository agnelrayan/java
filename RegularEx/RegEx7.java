package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegEx7 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","agne12"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","agnn122"));//false(more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","A1G2N3"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","A1G2N&"));//false(& is not matched)
    }
}
