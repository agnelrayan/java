package com.expertzlab.java8features;

/**
 * Created by agnel on 5/31/18.
 */
public class ThreadEx implements Runnable {
    public static void main(String[] args) {
        ThreadEx obj = new ThreadEx();
        Thread t = new Thread(obj);
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("In Run Method...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        Runnable r =()->{
            for(int i=0;i<5;i++)
            {

            System.out.println("Thread is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread t2 = new Thread(r);
        t2.start();
    }
}
