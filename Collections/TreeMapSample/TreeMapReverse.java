package com.expertzlab.Collections.TreeMapSample;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReverse {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap(Collections.reverseOrder());
        map.put(1,"AA");
        map.put(3,"CC");
        map.put(4,"KK");
        map.put(2,"DD");
        System.out.println(map);

        for(Map.Entry entry:map.entrySet()){
            System.out.println("Get Key:"+entry.getKey()+"Get Value:"+entry.getValue());
        }

        System.out.println("After removing the element-->");
        Object removedElement = map.remove(2);
        System.out.println("Removed Element: "+removedElement);
        for(Map.Entry entry:map.entrySet()){
            System.out.println("Get Key:"+entry.getKey()+"Get Value:"+entry.getValue());
        }

        System.out.println("Size of TreeMap: "+map.size());

        System.out.println("Last Entry:"+map.lastEntry());


        System.out.println("Head Map"+map.headMap(3));

        System.out.println("Tail Map"+map.tailMap(3));

        System.out.println("Last Key:"+map.lastKey());

        System.out.println("Map Value"+map.values());
        System.out.println("Remove the elements from the Tree Map-->");
        map.clear();

        System.out.println("Head Map"+map.headMap(1));


    }
}
