package com.expertzlab.Collections.PriorityQueueSample;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityTest1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(4);
        //pq.add(null);
      pq.remove(1);
        pq.remove(3);
        pq.add(-1);
        pq.add(-2);

        pq.remove(-2);

      //  pq.add(3);
      //  pq.offer(5);
       // pq.add(13);
       // pq.add("AA");
        //pq.add("CC");
       // pq.add("DD");
        //pq.offer("BB");
       // pq.add("EE");
       // pq.offer("KK");
       // System.out.println(pq);



        for(Object obj:pq)
            System.out.println(obj);

       /* Iterator itr = pq.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());*/

        PriorityQueue<String> queue1 = new PriorityQueue();
        queue1.offer("Cochin");
        queue1.offer("Chennai");
        queue1.offer("Bangalore");
        queue1.offer("Texas");
        System.out.println("Priority queue using Comparable:");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        PriorityQueue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
        queue2.offer("Cochin");
        queue2.offer("Chennai");
        queue2.offer("Bangalore");
        queue2.offer("Texas");
        System.out.println("\nPriority queue using Comparator:");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }


    }
}
