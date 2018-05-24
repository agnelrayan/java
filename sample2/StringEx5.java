package com.expertzlab.sample2;

/**
 * Created by agnel on 5/16/18.
 */
public class StringEx5 {
    public static void main(String[] args) {
        String name="Hi1Hw32are4You";
        String[] na = name.split("\\d+");
        for(String el:na)
            System.out.println(el);
    }
}
