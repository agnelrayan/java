package com.expertzlab.Collections.LinkedHashMapSample;

/*Concurrent Modification Errors*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashMapEx2 {
    public static void main(String[] args) {
        //HashMap<String, String> map = new HashMap<String, String>();
        ConcurrentHashMap <String,String> map = new ConcurrentHashMap<String, String>();
        //LinkedHashMap<String,String> map = new LinkedHashMap();
        map.put("Apple","Iphone7");
        map.put("Htc","htc1");
        map.put("Samsung","samsung1");

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            //ConcurrentModificationException
             map.put("Sony","Xperia");
        }

   /*     System.out.println("After Adding new Mobiles:");
        map.put("Sony","Xperia");
        Iterator itr2 = map.entrySet().iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }*/

    }
}
