package com.expertzlab.MultithreadEx;

class Third3 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("In Third3 class...");
            try {
                //Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

class Four4 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("In Fourth4 class...");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadExtendsDemo {
    public static void main(String[] args) {
        Third3 t = new Third3();
        t.start();
        boolean isalive=t.isAlive();
        System.out.println("IsAlive:"+isalive);

        Four4 t2 = new Four4();
        t2.start();
        //t2.start();
        boolean isAlive2=t2.isAlive();
        System.out.println("IsAlive2:"+isAlive2);

        t.setName("MyThread...");
        String getName=t.getName();
        System.out.println("GetName...:"+getName);



        int getPriority=t.getPriority();
        System.out.println("GetPriority:"+getPriority);


    }
}
