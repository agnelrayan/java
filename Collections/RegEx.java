package com.expertzlab.Collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".ss");
        Matcher m = p.matcher("ass");
        boolean b = m.matches();
       // System.out.println(b);
        //System.out.println(b2);

        boolean b2 = Pattern.compile(".ss").matcher("ass").matches();
        //System.out.println(b2);

        boolean b3 = Pattern.matches("..sak","sssaka");
       // System.out.println(b3);

        boolean b4 = Pattern.matches("[abc]?","c");
       // System.out.println(b4);

        boolean b5 = Pattern.matches("\\D","6");
      ///  System.out.println(b5);

        boolean b6 = Pattern.matches("\\D","b");
       // System.out.println(b6);

        boolean b7 = Pattern.matches("[a-zA-Z0-9]{6}","ag127@");
      //  System.out.println(b7);

     //   System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true

        boolean b8 = Pattern.matches("[789]{1}[0-9]{9}","9876543210");
      //  System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
        System.out.println(b8);

    }
}
