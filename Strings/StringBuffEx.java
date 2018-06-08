package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringBuffEx {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Welcome");
        str.append("Ag");
        System.out.println(str);

        str.insert(1,"Ray");
        System.out.println(str);

        StringBuffer str2 = new StringBuffer("Hi");
        str2.replace(1,2,"Helo");
        System.out.println(str2);

        StringBuffer str3 = new StringBuffer("Greetings");
        str3.delete(5,7);
        System.out.println(str3);

        StringBuffer str4 = new StringBuffer("Warm Welcome");
        str4.reverse();
        System.out.println(str4);

    }
}
