package com.expertzlab.Collections.HashSetSample;

import java.util.*;

/**
 * Created by Agnel on 17/10/17.
 */
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet();
        set.add(10);
        set.add(20);
        set.add(20);
       // set.add(null);
       // set.add(null);
        set.add(40);
        //set.add(null);

       // Example 1: Iterate without using Iterator
        for(Integer obj:set){
            System.out.println((obj));
        }

        // Method 1: Sorting HashSet using List interface
        List<Integer> setList = new ArrayList(set);
        Collections.sort(setList);

        // Displaying list
        System.out.println("HashSet elements after sorting: "+setList);

        // Method 2: Sorting using TreeSet
        TreeSet<Integer> tset = new TreeSet(set);
        System.out.println("HashSet elements after using TreeSet: "+tset);

        // Example 2: Iterate with using Iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Creating a TreeSet of HashSet elements
        System.out.println("Converting TreeSet from Hashset:");
        Set<Integer> tset2 = new TreeSet<Integer>(set);
        Iterator<Integer> it2 = set.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        /* public void clear(): It removes all the elements
      * from HashSet. The set becomes empty after this
      * method gets called.
      */
        set.clear();



    }

}
