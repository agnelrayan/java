package com.expertzlab.Collections.TreeSetSample;


import java.util.TreeSet;

public class TreeSetEx6 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet();
        set.add(20);
        set.add(10);
        set.add(30);
      //  set.add("AA");
        set.add(40);
        set.add(10);

        for(Object obj:set){
            System.out.println(obj);
        }
    }
}
