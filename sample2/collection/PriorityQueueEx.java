package com.expertzlab.sample2.collection;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by agnel on 5/22/18.
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
      //  queue.add(10);
        //queue.add(20);
       // queue.add(30);
      //  queue.add(-1);
        //queue.add(null);

        for(Object obj:queue){
            System.out.println(obj);
        }

        Random rn = new Random();
        for(int i=10;i<50;i++){
        rn.nextInt(i);
        queue.add(i);
        }


        for(Object obj:queue){
            System.out.println(obj);
        }
    }


}
