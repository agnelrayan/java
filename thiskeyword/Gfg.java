package com.expertzlab.thiskeyword;

public class Gfg {
    public static void main(String[] args)
    {
        // a final reference variable sb
        final StringBuilder sb = new StringBuilder("Geeks");
        //final StringBuffer sb = new StringBuffer("Geeks");

        System.out.println(sb);

        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForGeeks");

        System.out.println(sb);
    }
}
