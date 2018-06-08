package com.expertzlab.MultithreadEx;

class Count extends Thread{
    Count(){
        super("My Extending Thread");
        System.out.println("My Thread is created"+this);
        start();
    }

    public void run(){
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println("Printing the count"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("My Thread Interrupted");
        }
        System.out.println("My thread run is over");
    }

}

public class ThreadEx4 {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.isAlive()) {
                System.out.println("Main thread will be alive till child thread is alive");
                Thread.sleep(1000);
            }
        }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        System.out.println("Main thread run is over");
        }
    }


