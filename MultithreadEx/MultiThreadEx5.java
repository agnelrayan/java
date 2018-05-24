package com.expertzlab.MultithreadEx;

class Threadex1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
        {
            System.out.println("In First Class");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }



}

class Threadex2 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("IN Second class");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }
}


public class MultiThreadEx5 {
    public static void main(String[] args) {
        Threadex1 t1 = new Threadex1();
        t1.start();

        Threadex2 t2 = new Threadex2();
        t2.start();



    }
}
