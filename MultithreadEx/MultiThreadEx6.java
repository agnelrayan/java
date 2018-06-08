package com.expertzlab.MultithreadEx;

class Threadex3 implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++)
        {
            System.out.println("*****");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }

}


class Threadex4 implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++)
        {
            System.out.println("*!*!*!");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }

}

public class MultiThreadEx6 {
    public static void main(String[] args) {
        Threadex3 obj = new Threadex3();
        Thread t1 = new Thread(obj);

        Threadex4 obj2 = new Threadex4();
        Thread t2 = new Thread(obj2);

        t1.getPriority();

        t1.start();

        try {
            t1.join(500);
        }
        catch(Exception e){
            System.out.println(e);

        }

        boolean r=t1.isAlive();
        System.out.println(r);
        t2.start();
        t2.isAlive();
        //t2.start();
t1.isAlive();

    }
}
