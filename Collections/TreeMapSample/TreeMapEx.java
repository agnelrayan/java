package com.expertzlab.Collections.TreeMapSample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(10,"Ag");
        map.put(30,"Ray");
        map.put(50,"Joy");
        map.put(20,"Joe");
       // System.out.println(map);

        System.out.println("Sorting by Natural Ordering");
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("Sorting by Descending Order");
        map = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return(x>y)?-1:((x==y)?0:1);
            }
        });

        map.put(25,"Franc");
        map.put(35,"Loyo");
        map.put(15,"Xavier");
       // System.out.println(map);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
