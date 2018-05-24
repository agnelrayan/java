package com.expertzlab.RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geo on 17/8/17.
 */
public class RegEx2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("ss");
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        boolean b3 = Pattern.matches(".s","as");
        System.out.println(b3);

    }
}
