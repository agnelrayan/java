package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx9 {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
       // set.add(12);
        set.add("AB");
       // set.add(23.32);
        set.add("AG");
        set.add(null);
        set.add(null);
        set.add("AB");
        set.add("AF");

        for(Object obj:set){
            System.out.println(obj);
        }
    }
}
