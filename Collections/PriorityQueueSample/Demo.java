package com.expertzlab.Collections.PriorityQueueSample;


import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(10);
        queue.add(30);
        queue.add(10);
        queue.add(-1);
       // queue.add(null);
        queue.add(1);
        queue.add(-2);
       // queue.add("AB");

        System.out.println(queue);

        System.out.println("AFter Polling");
        queue.poll();
        System.out.println(queue);

        System.out.println("using element");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
