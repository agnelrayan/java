package com.expertzlab.Collections.PriorityQueueSample;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx7 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int i=0;i<=10;i++){

            pq.add(new Integer(i));
        }
        System.out.println(pq);

        // clear the queue
        pq.clear();
        int i=pq.size();
        System.out.println(i);



        // create priority queue
        PriorityQueue < Integer >  prq = new PriorityQueue < Integer > ();

        // insert values in the queue
        prq.add(6);
        prq.add(9);
        prq.add(5);
        prq.add(64);
        prq.add(6);

        System.out.println ( "Priority queue values are: "+ prq);

        // create comparator
        Comparator comp = prq.comparator();
       // System.out.println("After Comparator"+comp);

        System.out.println ( "Comparator value is: "+ comp);
    }
}
