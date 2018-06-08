package com.expertzlab.Collections.PriorityQueueSample;

import java.util.PriorityQueue;

public class PrirorityQueueTest2 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(2);
        pq.add(1);

        for(Object obj:pq)
            System.out.println(obj);

        System.out.println("After Polling");
        System.out.println(pq.poll());
        System.out.println(pq);

        System.out.println("After Peak");
        System.out.println(pq.peek());
        System.out.println(pq);

        pq.remove(5);
        System.out.println(pq);

        System.out.println(pq.size());

       // pq.add("AA");
        //pq.add(null);

        pq.offer(3);

        System.out.println(pq);

    }
}
