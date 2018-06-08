package com.expertzlab.RegularEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile(".s");
        //Matcher m = p.matcher("a*s");
        //boolean b = m.matches();
        //System.out.println(b);


        //Pattern p2 = Pattern.compile(".s");
        //boolean b2= p.matcher("ss").matches();
        //System.out.println(b2);

        boolean b3 = Pattern.matches("[a-z&&[^bc]]","d");
       // System.out.println(b3);

        Pattern p = Pattern.compile("[amn]");
        Matcher m = p.matcher("amn");
        boolean b = m.matches();
       // System.out.println(b);

        boolean b4 = Pattern.matches("[789][0-9]{9}","9159767562");
        System.out.println(b4);

    }

}
