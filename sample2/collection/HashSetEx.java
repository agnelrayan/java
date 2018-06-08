package com.expertzlab.sample2.collection;

import java.util.HashSet;

/**
 * Created by agnel on 5/21/18.
 */
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
       boolean s1= set.add("Apple");
        boolean s2=set.add("Orange");
        boolean s3=set.add("Mango");
        boolean s4=set.add("Apple");
        boolean s5=set.add(null);
        boolean s6=set.add(null);
        //set.add(20);

        for(String fruits:set){
            System.out.println(fruits);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}
