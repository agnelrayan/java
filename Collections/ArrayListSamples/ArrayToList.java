package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {

    public static void main(String[] args) {

        //ArrayList internally uses  array  object to add(or store) the elements. In other words, ArrayList is backed by Array data -structure.The array of ArrayList is resizable (or dynamic).
        String[] arr={"AAA","BBB","CCC","EEE","DDD"};

        ArrayList<String> al = new ArrayList(Arrays.asList(arr));

        al.add("FFF");
        al.add("HHH");
        al.add("GGG");

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Object a[] =al.toArray();
        System.out.println("After Converting:"+a);

    }
}
