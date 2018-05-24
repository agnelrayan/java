package com.expertzlab.Collections.LinkedHashMapSample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
        map.put("AA",10);
        map.put("CC",30);
        map.put("DD",40);
        map.put("BB",20);
        System.out.println(map);

      //  map.remove("CC",30);
        System.out.println(map);

        int i=map.get("AA");
        System.out.println("By Get Method:"+i);

        int j=map.get("DD");
        System.out.println("By Get Method:"+j);

        System.out.println("Getting value for key 'one': "+map.get("CC"));
        System.out.println("Size of the map: "+map.size());
        System.out.println("Is map empty? "+map.isEmpty());
        System.out.println("Contains key 'two'? "+map.containsKey("two"));
        System.out.println("Contains value 'This is first element'? "+map.containsValue("AA"));
        System.out.println("delete element 'one': "+map.remove("DD"));

        ///Map.Entry entry = map.entrySet();
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("Sorting by Tree Map");
        TreeMap<String,Integer> map2 = new TreeMap<String, Integer>(map);
        for(Map.Entry entry2:map2.entrySet()){
            System.out.println(entry2.getKey()+":"+entry2.getValue());
        }

        System.out.println("Only Iterating the Keys:");
        Set<String> keys = map.keySet();
        for(String k:keys){
            System.out.println(k+" -- "+map.get(k));
        }

        map.clear();
        System.out.println(map);
    }
}
