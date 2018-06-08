package com.expertzlab.Collections.TreeSetSample;

import java.util.TreeSet;

/**
 * Created by Agnel on 18/10/17.
 */
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(40);
       // treeSet.add(null);// Throws NullPointerException

        System.out.println(treeSet);

        TreeSet <String> treeSet2  = new TreeSet<String>();
        treeSet2.add("Cochin");
        treeSet2.add("Chennai");
        treeSet2.add("Bangalore");
        System.out.println(treeSet2);
    }
}
