package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;

public class HashSetEx8 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("AB");
        names.add("AC");
        names.add("AE");
        names.add("AF");
        names.add(null);
        names.add(null);
        names.add("AB");

        for(String name:names){
            System.out.println(name);
        }
    }
}
