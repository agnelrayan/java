package com.expertzlab.Collections.HashMapSample;


import java.util.*;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"AG");
        hashMap.put(1,"AG");
        hashMap.put(null,null);
        hashMap.put(null,"Raya");
        hashMap.put(null,null);
        System.out.println(hashMap);



        Set set = hashMap.entrySet();
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            Map.Entry map = (Map.Entry) itr.next();
            System.out.println(map.getKey()+","+map.getValue());
        }

        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        hm.put("Ag",1);
        hm.put("Ray",3);
        hm.put("JOy",4);
        hm.put("Ag",5);

        System.out.println("Using for Loop:");
        for(Map.Entry entry:hm.entrySet())
        {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
