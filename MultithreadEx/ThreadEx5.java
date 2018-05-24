package com.expertzlab.MultithreadEx;


public class ThreadEx5 extends Thread {

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
        System.out.println("Current Thread bye getName:"+Thread.currentThread().getName());
        System.out.println("Current Thread  getId:"+Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        ThreadEx5 t = new ThreadEx5();
        System.out.println("Minimum Priority");
        t.setPriority(Thread.MIN_PRIORITY);

        t.start();
        ThreadEx5 t2 = new ThreadEx5();
        System.out.println("Maximum Priority");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        System.out.println("First thread Name:"+t.getName());
        System.out.println("First thread Name:"+t2.getName());
        System.out.println("Id of Thread:"+t.getId());
        System.out.println("Id of Thread:"+t2.getId());


        t.setName("AG");
        System.out.println("AFter the given name for the thread:"+t.getName());

        t.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);

    }
}
