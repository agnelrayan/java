package com.expertzlab.Collections.TreeSetSample;


import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet();
        set.add("AA");
        set.add("CC");
        set.add("AA");
        set.add("Bala");
        set.add("Cabil");
        set.add("EE");
        set.add("DD");

        //set.add(10);
        //set.add(null);
        System.out.println(set);
        System.out.println(set.headSet("D"));
        System.out.println(set.tailSet("D"));
        System.out.println(set.subSet("B","E"));
    }
}
