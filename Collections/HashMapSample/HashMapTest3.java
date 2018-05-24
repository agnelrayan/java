package com.expertzlab.Collections.HashMapSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3{
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(1,"AG");
        hm.put(12,"BC");
        hm.put(2,"eE");
        hm.put(null,null);
        hm.put(null,null);
        hm.put(null,null);
        hm.put(3,null);
        hm.put(4,null);


        for(Map.Entry me: hm.entrySet())
            System.out.println(me.getKey()+": "+me.getValue());


       /* for(Map.Entry me: hm.entrySet())
            System.out.println(me.getValue()+": "+me.getKey());

       /* String var = hm.get(12);
        System.out.println(var);

        String var2=hm.remove(1);
        System.out.println(var2);

        for(Map.Entry me: hm.entrySet())
            System.out.println(me.getValue()+": "+me.getKey());

        System.out.println(hm.containsKey(1));
        //System.out.println(var3);*/



    }
}
