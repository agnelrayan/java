package com.expertzlab.Collections.LinkedListSample;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx4 {
    public static void main(String[] args) {
        LinkedList<String> passengerList = new LinkedList();
        passengerList.add("AB");
        passengerList.add("CD");
       // passengerList.add(null);
        passengerList.add("AB");
        passengerList.add("IK");
        System.out.println("Without Iteration:");
        System.out.println(passengerList);
        System.out.println("Iterate the elments in Linked List:");

        System.out.println("Sorted Collection");
       Collections.sort(passengerList);
        for(String obj:passengerList){
            System.out.println(obj);
        }

        System.out.println("Iterating using Iterator Iterface");
        System.out.println("Forward Direction:");
        ListIterator itr = passengerList.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Backword Direction:");
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }



    }
}
