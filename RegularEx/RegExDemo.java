package com.expertzlab.RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by agnel on 5/25/18.
 */
public class RegExDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".a");
        Matcher m = p.matcher("sa");
        boolean b = m.matches();
        System.out.println(b);


        boolean b2=Pattern.compile(".a").matcher("sa").matches();
        System.out.println(b2);

        boolean b3=Pattern.matches(".a","sa");
        System.out.println(b3);

        System.out.println(Pattern.matches("[789][0-9]{9}","7896666679"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
    }

}
