package com.expertzlab.MultithreadEx;

class MultiThreadTest3 implements Runnable{

      public void run(){
          System.out.println("IN Test3");
          System.out.println("Thread name"+Thread.currentThread().getName());
          System.out.println("Thread Priority"+Thread.currentThread().getPriority());
      }

        }

class MultiThreadTest2 {
    public static void main(String[] args) {

        MultiThreadTest3 obj = new MultiThreadTest3();
        Thread t = new Thread(obj);

        t.setPriority(Thread.MAX_PRIORITY);


        int i=t.getPriority();
        System.out.println(i);
        t.start();
        boolean b=t.isAlive();
        Thread t2 = new Thread(obj);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.start();
      //  boolean b=t.isAlive();
        System.out.println(b);


        Thread t3 = new Thread(obj);
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.run();


    }
}
