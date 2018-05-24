package com.expertzlab.Collections.PriorityQueueSample;

import java.util.PriorityQueue;


public class PQEx4 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("AG");
        pq.add("AB");
        pq.add("CD");
        pq.add("AA");

        System.out.println(pq);
    }
}
