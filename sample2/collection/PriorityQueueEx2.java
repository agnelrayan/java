package com.expertzlab.sample2.collection;

import java.util.PriorityQueue;

/**
 * Created by agnel on 5/22/18.
 */
public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(10);
        queue.add(-2);
        queue.add(20);
        queue.add(50);
        queue.add(5);
       // queue.add(null);

        for(Object que:queue){
            System.out.println(que);
        }

        System.out.println("Contains:"+queue.contains(10));//true
        System.out.println("Peek:"+queue.peek());


        System.out.println("After Peek:");
        for(Object que:queue){
            System.out.println(que);
        }

        System.out.println("AFter Poll:");
        System.out.println(queue.poll());
        System.out.println("Iterate the Poll:");

        for(Object que:queue){
            System.out.println(que);
        }

        System.out.println("After Remove:");
        System.out.println(queue.remove());


        for(Object que:queue){
            System.out.println(que);
        }

        //System.out.println("Size of que:"+queue.size());
    }
}
