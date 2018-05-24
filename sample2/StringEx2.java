package com.expertzlab.sample2;

import java.util.Arrays;

/**
 * Created by agnel on 5/16/18.
 */
public class StringEx2 {
    @Override
    public String toString() {
        return "StringEx2{}";
    }

    public static void main(String[] args) {
        String name="Joh Johny";
        name=name+"hw are you";
        System.out.println(name);

        String str[]={"Ag","ray","Shaj"};
        Arrays.sort(str);
        System.out.println(str);
    }
}
