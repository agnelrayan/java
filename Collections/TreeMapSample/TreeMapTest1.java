package com.expertzlab.Collections.TreeMapSample;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap();
        tm.put(1,"AG");
        tm.put(3,"Ray");
        tm.put(2,"Sis");
        tm.put(4,null);

        for(Map.Entry me : tm.entrySet())
            System.out.println(me.getKey()+" "+me.getValue());

        System.out.println(tm.pollFirstEntry());
        System.out.println(tm);

        System.out.println(tm.pollLastEntry());
       // System.out.println(tm);

        System.out.println(tm.tailMap(2));
       // System.out.println(tm);

      //  System.out.println(tm.floorEntry(1));

      /*  tm.remove(4);
        System.out.println(tm);

        System.out.println(tm.floorEntry(2));
        System.out.println(tm.ceilingEntry(1));
        System.out.println(tm.containsKey(1));
        System.out.println(tm.ceilingKey(1));
        System.out.println(tm.firstEntry());
        System.out.println(tm.size());
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.size());*/
       // System.out.println("AFter Ceiling entry"+tm);



    }
}
