package com.expertzlab.StaticEx;

/**
 * Created by agnel on 5/23/18.
 */
public class Counter {
    static int count=0;
    Counter(){
        count++;
        System.out.println("Count:"+count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new  Counter();
        Counter c3 = new Counter();
    }
}
