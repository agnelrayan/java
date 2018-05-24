package com.expertzlab.Collections.HashMapSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap();
        hm.put(2,"AA");
        hm.put(3,"CC");
        hm.put(1,"BB");
        hm.put(2,"DD");

        boolean i = hm.containsKey(1);
        boolean i2=hm.containsKey(2);
        boolean i3=hm.containsKey(3);
        boolean i4=hm.containsKey(2);

        System.out.println("HashCode:"+i);
        System.out.println("HashCode:"+i2);
        System.out.println("HashCode:"+i3);
        System.out.println("HashCode:"+i4);

        for(Map.Entry em:hm.entrySet())
            System.out.println("Id:"+em.getKey()+" " +"Value:"+em.getValue());

            }
}
