package com.expertzlab.Collections.HashMapSample;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        map.put("Arul",90989894);
        map.put("Ajay",99089090);
        map.put("Joy",90889834);
        map.put("Jose",90434343);
        map.put(null,null);
        map.put(null,null);
        map.put("Jose",904343435);
        map.put("Jega",null);
        map.put("Jegan",null);

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        System.out.println("Values()..."+map.values());

      /*  System.out.println("Using Iterator...");
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            // System.out.println(it.next());
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/

        int var= map.get("Arul");
        System.out.println("Var:"+var);

    }
}
