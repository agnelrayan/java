package com.expertzlab.MultithreadEx;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Method in A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}

}

class B extends Thread{
    public void run(){
    for(int j=0;j<5;j++)
    {
        System.out.println("Method in B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }}
}

public class MultiThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        B t2 = new B();
        //t.start();
        //t.run();
        t.start();
       // t.sleep(1000);

        t.join(1000);
        t2.start();
        //t2.run();
    }
}

