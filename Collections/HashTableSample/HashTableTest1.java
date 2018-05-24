package com.expertzlab.Collections.HashTableSample;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable();
        ht.put(1,"BB");
        ht.put(3,"CC");
        ht.put(4,"DD");
        ht.put(2,"AA");
        ht.put(7,"EE");
       // ht.put(null,null);
       // ht.put(null,"DDD");
        ht.put(3,"FF");
       // ht.put(8,null);

        for(Map.Entry me:ht.entrySet())
            System.out.println(me.getKey()+" "+me.getValue());

    }
}
