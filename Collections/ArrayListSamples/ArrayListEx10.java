package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by geo on 16/10/17.
 *
 */
public class ArrayListEx10 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("AB");
        al.add("CD");
        al.add("Ac");

        System.out.println("Without Iteration:"+al);

        Iterator itr = al.iterator();
        System.out.println("With Iterator:");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Wiht for loop");
        for(String obj:al){
            System.out.println(obj);
        }
        System.out.println("After Sorting the Collections:");
        Collections.sort(al);
        System.out.println("Wiht for loop");
        for(String obj:al){
            System.out.println(obj);
        }
    }

}
