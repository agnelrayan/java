package com.expertzlab.Collections.PriorityQueueSample;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Pq1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(new Integer(1));
        pq.add(3);
        pq.add(2);
        pq.add(4);
        pq.add(10);
        pq.add(5);
        System.out.println("Order without");
        System.out.println(pq);

        System.out.println("AFter Polling");
        pq.poll();
        System.out.println(pq);

        System.out.println("In Enhanced For Loop ");
        for(Object obj:pq)
            System.out.println(obj);

        System.out.println("After Polling");
        pq.poll();
        for(Object obj:pq)
            System.out.println(obj);

        System.out.println("In Iterator");
        Iterator itr = pq.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        System.out.println("After Polling");
        pq.poll();
        Iterator itr2 = pq.iterator();
        while(itr2.hasNext())
        System.out.println(itr2.next());






    }


    }






