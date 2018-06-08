package com.expertzlab.Collections.HashMapSample;


import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(11,"AG");
        map.put(33,"Ray");
        map.put(22,"Anto");
        map.put(10,"Joe");

        //for Loop
        System.out.println("Using for loop");
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());

        }

        //while loop & Iterator

        System.out.println("Usig while loop");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry1 = (Map.Entry) it.next();
            System.out.println(entry1.getKey()+":"+entry1.getValue());
        }

        System.out.println("Sorting the HashMap:");
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>(map);
        for(Map.Entry entry: tmap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        //size of method
        System.out.println("Size of HashMap : " + map.size());

        // Copying one HashMap "hmap" to another HashMap "hmap2"
        //hmap2.putAll(hmap);

        System.out.println("Is HashMap Empty? "+map.isEmpty());

        //get only the key value
        Set<Integer> keys = map.keySet();

        System.out.println("Set of Keys contains: ");

        Iterator iterator =keys.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

// cloning first HashMap in the second one
        HashMap map2=(HashMap)map.clone();

        System.out.println("Cloned Map contains: "+map2);
    }
}
