package com.expertzlab.Collections.PriorityQueueSample;


import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        for(int i=0;i<=5;i++){
            pq.add(i);
        }
        System.out.println(pq);
        pq.add(6);
        pq.add(8);
        pq.offer(7);
        pq.add(5);
        pq.offer(-2);
        System.out.println(pq);
        System.out.println("Element() Method"+pq.element());
        System.out.println(pq);


        pq.poll();
        System.out.println("After Poll"+pq);

        System.out.println("Peek Element is:"+pq.peek());
        System.out.println("After Peek"+pq);

        //pq.add(null);
        //pq.add(null);
        System.out.println("After Peek"+pq);

        //pq.offer(null);
        boolean result =pq.contains(5);
        System.out.println("Contains or not:"+result);
        System.out.println("After Peek"+pq);

        System.out.println("1st-Poll Element is:"+pq.poll());
        System.out.println("After Poll"+pq);

        System.out.println("2-nd Poll Element is:"+pq.poll());
        System.out.println("After Poll"+pq);


        boolean isremoved = pq.remove(7);
        System.out.println("After Remove() :"+isremoved);

        //Iterator
        System.out.println("Using Itertor:");
        Iterator itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // get objects from the queue
        Object[] arr = pq.toArray();

        System.out.println ( "Value in array: ");

        for ( int i = 0; i<arr.length; i++ ){
            System.out.println ( "Value: " + arr[i].toString()) ;
        }
    }

    }

