package com.expertzlab.Collections.HashMapSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"BBB");
        hm.put(3,"DDD");
        hm.put(2,"AA");


        for(Map.Entry me : hm.entrySet())
        //System.out.println(me);
        System.out.println("Id:"+me.getKey()+" "+" Name:"+me.getValue());



       /* Set set = (Set) hm.entrySet();

        Iterator itr = set.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());*/


    }
}
