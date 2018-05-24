package com.expertzlab.sample2;

/**
 * Created by agnel on 5/16/18.
 */
public class StringEx4 {
    public static void main(String[] args) {
        String name="Agnel Rayan";
     //   int i=name.lastIndexOf('n');
        int i=name.lastIndexOf("gn");
        System.out.println(i);

        String sbname = name.substring(i);
        System.out.println(sbname);
    }
}
