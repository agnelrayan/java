package com.expertzlab.Collections.HashMapSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"AA");
        hm.put(3,"CC");
        hm.put(4,"DD");
        hm.put(2,"CC");
        hm.put(1,"AA");
        //hm.put(null,"dD");
        //hm.put(null,"CC");
        hm.put(null,null);

        for(Map.Entry me:hm.entrySet())
            System.out.println(me.getKey()+" "+me.getValue());

        System.out.println(hm.containsKey(6));
        System.out.println(hm.containsValue("KK"));

        System.out.println(hm.get(1));

        System.out.println(hm.isEmpty());

        System.out.println(hm.size());
    }
}
