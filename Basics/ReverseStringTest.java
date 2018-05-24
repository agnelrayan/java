package com.expertzlab.Basics;

/**
 * Created by geo on 28/7/17.
 */
public class ReverseStringTest {
    public static void main(String[] args) {
        String str="Welcome";

       // char ch2[] = (char )ch;
       // char[] try1 = input.toCharArray();

        char ch2[] = str.toCharArray();

        //System.out.println(ch2);

        for(int i=ch2.length-1;i>=0;i--)
            System.out.println(ch2[i]);

        //StringBuilder str3 = new StringBuilder("Helo");
        //System.out.println(str3.reverse());

        //StringBuffer str4 = new StringBuffer("helo hi");
        //System.out.println(str4.reverse());

    }





}
