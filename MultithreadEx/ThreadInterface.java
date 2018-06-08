package com.expertzlab.MultithreadEx;

class AA implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("IN Class A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class BB implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In Class B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadInterface {
    public static void main(String[] args) {
        AA obj = new AA();
        BB obj2 = new BB();

        Thread t = new Thread(obj);
        Thread t2 = new Thread(obj2);

        System.out.println("Current Thread"+Thread.currentThread());

        t.start();
        System.out.println("Thread t si:"+t.isAlive());
        t2.start();
        System.out.println("Thread t2 is:"+t2.isAlive());


    }



}
