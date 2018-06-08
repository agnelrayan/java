package com.expertzlab.MultithreadEx;
import java.lang.Thread;
public class Thread1 extends Thread  {
    public void run(){
        System.out.println("In Thread");
    }
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}
