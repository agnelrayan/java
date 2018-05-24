package com.expertzlab.Collections.TreeMapSample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap();
        tm.put("AA",2);
        tm.put("CC",1);
        tm.put("BB",3);
        tm.put("DD",4);
        tm.put("SS",null);
        tm.put("GG",null);

        for(Map.Entry mp: tm.entrySet())
            System.out.println(mp.getKey()+" "+mp.getValue());

               tm.clear();
        System.out.println(tm.isEmpty());
        System.out.println(tm.size());



    }
}
