package com.expertzlab.Basics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx2 {
    public static void main(String[] args) {

        //assign for loadMap() method

        Map<Integer,String> map=loadMap();

        map.put(4,"DD");
        map.put(5,"EE");
        System.out.println(map);

        System.out.println("By Iterator:");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //assign for  loadMap2() method
        Map<Integer,String> map2 = loadMap2();
                map.put(100,"EE");
                map.put(200,"FF");
                map.put(300,"GG");


            System.out.println("By Iterator:");
            Iterator itr2 = map2.entrySet().iterator();
            while(itr2.hasNext()) {
                System.out.println(itr2.next());
            }

        //assign for creatMap() method
        Map<Integer,String> map3 = createMap();
        map.put(666,"GGG");
        map.put(777,"HHH");
        Iterator itr3 = map3.entrySet().iterator();
        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }

            }





    private static Map<Integer,String> loadMap(){
        Map<Integer,String> map = new HashMap<Integer, String>();


        map.put(1,"AA");
        map.put(3,"BB");
        map.put(2,"CC");
        System.out.println(map);



        //return Collections.unmodifiableMap(map);
        return map;
    }


    private static Map<Integer,String> loadMap2(){
        Map<Integer,String> map2 = new HashMap<Integer, String>();
        map2.put(10,"AA");
        map2.put(20,"DD");
        map2.put(40,"CC");
        return map2;
    }
    //private static final Map<Integer, String> myMap2 = createMap();


    private static Map<Integer, String> createMap() {
        Map<Integer, String> result = new HashMap<Integer, String>();
        result.put(333, "one");
        result.put(444, "two");
        return Collections.unmodifiableMap(result);
    }

    private static final Map<Integer, String> myMap = new HashMap<Integer, String>();
    static {
        myMap.put(111, "one");
        myMap.put(222, "two");
        System.out.println(myMap);

        System.out.println("using by Static block:");
        Iterator itr = myMap.entrySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
    }

