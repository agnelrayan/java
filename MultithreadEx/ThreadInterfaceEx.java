package com.expertzlab.MultithreadEx;

class Third implements Runnable {

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("In Third class...");
            try {
                //Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}
class Four implements Runnable{

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("In Fourth class...");
            try {
                //Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}
public class ThreadInterfaceEx {
    public static void main(String[] args) {
        Third  obj = new Third();
        Thread t = new Thread(obj);

        Four obj2 = new Four();
        Thread t2 = new Thread(obj2);

        t.start();

        Thread.State getState2=t.getState();
        System.out.println("ThreadState--start:"+getState2);
        try {
            t.join(1500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();
        int priority=t.getPriority();
        System.out.println("GetPriority:"+priority);

        int priority2=t2.getPriority();
        System.out.println("GetPriority2:"+priority2);

        boolean isalive=t.isAlive();
        System.out.println("Is alive:"+isalive);

        long getId=t.getId();
        System.out.println("GetId:"+getId);

        long getId2=t2.getId();
        System.out.println("GetId:"+getId2);

        long getId3=t2.getId();
        System.out.println("GetId:"+getId3);

        t.setPriority(5);
        System.out.println("AFter setting the Priority:"+t.getPriority());

        String getName=t.getName();
        System.out.println("GetName:"+getName);

        t.setName("MyThread");
        System.out.println("SetName:"+t.getName());

        Thread.State getState=t.getState();
        System.out.println("ThreadState:"+getState);
    }
}
