package com.expertzlab.RegularEx;

import java.util.regex.Pattern;

/**
 * Created by geo on 12/9/17.
 */
public class RegEx8 {
    public static void main(String[] args) {
        System.out.println("By characters classes and quantifiers");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9159767562"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}","3434322323"));//false

        System.out.println("By MetaCharacters");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","9159767562"));//true
        System.out.println(Pattern.matches("[789]{1}\\d{9}","6159767562"));//false



    }
}
