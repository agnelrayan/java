package com.expertzlab.Collections.HashSetSample;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(20);
       // obj.add(null);
        System.out.println(obj);


        Set<Integer> obj2 = new HashSet();
        for(int i=0;i<=10;i++){
            obj2.add(i);
        }
        System.out.println(obj2);

        int count[]={10,30,20,10,40,50};

        for(int i =0;i<count.length;i++){
            obj2.add(count[i]);
        }

        System.out.println(obj2);

        TreeSet sortedSet = new TreeSet<Integer>(obj2);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        //Collections.sort(obj2);

        TreeSet <Integer> obj3 = new TreeSet<Integer>(obj2);
        System.out.println(obj3);
    }
}
