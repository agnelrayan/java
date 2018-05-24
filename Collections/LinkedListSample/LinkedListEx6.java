package com.expertzlab.Collections.LinkedListSample;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx6 {
    public static void main(String[] args) {
        Deque<String> names = new LinkedList();
        names.add("AG");
        names.add("ABI");
        names.add("Arul");
        names.add("Anto");
        names.add("Arun");
        names.add("Arun");
        names.add(null);
        names.add(null);

        System.out.println("Forward Direction....");

        ListIterator itr = (ListIterator) names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        int size=names.size();
        System.out.println("Size of the LL:"+size);

        boolean isempty=names.isEmpty();//false

        //names.add(0,"Java");

        ListIterator itr2 = (ListIterator) names.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //System.out.println("Get value:"+names.get(0));
        //names.get(0);

        System.out.println("GetLast value:"+names.getFirst());


      /*  System.out.println("Backward Direction...");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }*/
    }
}
