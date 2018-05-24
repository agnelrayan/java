package com.expertzlab.Collections.HashMapSample;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"AA");
        map.put(3,"CC");
        map.put(2,"BB");
        map.put(0,"DD");
        map.put(0,"EE");
        map.put(1,"EE");
        map.put(null,"AA");
        map.put(null,"KK");

        System.out.println(map);

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
           // System.out.println(it.next());
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

         /* Get values based on key*/
        String var= map.get(2);
        System.out.println("Value at index 2 is: "+var);

         /* Remove values based on key*/
        map.remove(3);
        System.out.println("Map key and values after removal:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

        HashMap<Integer,String> map2 = new HashMap();
        map2.put(11,"Ag");
        map2.put(22,"Ray");

        //After PutAll
        map2.putAll(map);
        Set set3 = map2.entrySet();
        Iterator iterator3 = set3.iterator();
        while(iterator3.hasNext()) {
            Map.Entry entry3 = (Map.Entry)iterator3.next();
            System.out.print("Key is: "+entry3.getKey() + " & Value is: ");
            System.out.println(entry3.getValue());
        }


    }
}
