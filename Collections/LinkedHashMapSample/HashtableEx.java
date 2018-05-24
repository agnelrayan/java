package com.expertzlab.Collections.LinkedHashMapSample;

import java.util.*;

public class HashtableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable();
        map.put(1,"AG");
        map.put(3,"Ray");
        map.put(4,"Jose");
        map.put(2,"Joe");
        map.put(102,"Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");

        for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Keys are:"+" "+entry.getKey()+" " +"Values are:"+entry.getValue());
        }

        System.out.println("AFter remove the element");
        map.remove(102);



      /*  for(Map.Entry entry:map.entrySet())
        {
            System.out.println("Keys are:"+" "+entry.getKey()+" " +"Values are:"+entry.getValue());
        }*/

        System.out.println("Iteration");
        Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            System.out.println("Value of "+key+" is: "+map.get(key));
        }

        System.out.println("Size of Hashtable: " + map.size());

        System.out.println("Value of key 'second': "+map.get(1));//AG
        System.out.println("Is Hashtable empty? "+map.isEmpty());

        //To copy Map content to another Hashtable
        Hashtable<String, String> hm = new Hashtable<String, String>();
        //add key-value pair to Hashtable
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);

        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);

        //To search a key in Hashtable
        if(hm.containsKey("first")){
            System.out.println("The Hashtable contains key first");
        } else {
            System.out.println("The Hashtable does not contains key first");
        }
        if(hm.containsKey("fifth")){
            System.out.println("The Hashtable contains key fifth");
        } else {
            System.out.println("The Hashtable does not contains key fifth");
        }

        //To search a key in Hashtable
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The Hashtable contains value SECOND INSERTED");
        } else {
            System.out.println("The Hashtable does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The Hashtable contains value first");
        } else {
            System.out.println("The Hashtable does not contains value first");
        }


        // Removing all mappings
        map.clear();

    }
}
