package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx5 {

    public static void main(String a[]) {
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("franci");
        hs.add("sss");
        hs.add("ttt");
        hs.add("fff");
        hs.add("fff");
        hs.add("six");
        hs.add("zebra");

        for(String obj:hs){
            System.out.println(obj);

            System.out.println(hs);//third four five first second
            System.out.println("Is HashSet empty? " + hs.isEmpty());
            System.out.println("Size of the HashSet: " + hs.size());      }
        System.out.println("Does HashSet contains first element? " + hs.contains("first"));//true
        System.out.println("Does HashSet contains first element? " + hs.contains("seven"));//false


        TreeSet<String> tset = new TreeSet(hs);
        System.out.println(tset);

        /*
        System.out.println(hs);//third four five first second
        System.out.println("Is HashSet empty? " + hs.isEmpty());//false

        hs.remove("third");
        System.out.println(hs);//four five first second

        System.out.println("Size of the HashSet: " + hs.size());//4
        System.out.println("Does HashSet contains first element? " + hs.contains("first"));//true
        System.out.println("Does HashSet contains first element? " + hs.contains("seven"));//true

        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }*/

    }
}