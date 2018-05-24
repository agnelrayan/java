package com.expertzlab.MultithreadEx;

class FirstInt implements Runnable{

    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("IN First Class...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
class SecondInt implements Runnable{


    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("IN Second Class...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadInterfaceDemo {
    public static void main(String[] args) throws InterruptedException {
        FirstInt obj = new FirstInt();
        Thread t = new Thread(obj);
        SecondInt obj2 = new SecondInt();
        Thread t2 = new Thread(obj2);
        t.start();
        t.join();
        t2.start();
    }
}

