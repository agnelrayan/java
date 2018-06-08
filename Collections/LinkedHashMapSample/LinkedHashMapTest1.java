package com.expertzlab.Collections.LinkedHashMapSample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lmp = new LinkedHashMap();
        lmp.put(2,"BB");
        lmp.put(3,"CC");
        lmp.put(1,"DD");
        lmp.put(4,"EE");
        lmp.put(null,null);
        lmp.put(null,"FF");
        lmp.put(2,"BB");

        for(Map.Entry me : lmp.entrySet())
            System.out.println(me.getKey()+" "+me.getValue());

        System.out.println(lmp.get(3));
        System.out.println(lmp.size());

    }
}
