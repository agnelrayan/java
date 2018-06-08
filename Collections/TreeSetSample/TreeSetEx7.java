package com.expertzlab.Collections.TreeSetSample;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetEx7 {
    public static void main(String[] args) {
        String str[]={"Ag","AB","AC","AD","AB","AC","AB"};
        List<String> list = Arrays.asList(str);

        TreeSet<String> set = new TreeSet(list);
        System.out.println(set);
    }
}
