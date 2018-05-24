package com.expertzlab.MultithreadEx;


class ThreadEx extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                 System.out.println("<--IN ThreadEx class--->");
                Thread.sleep(1500);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }

}

class ThreadEx2 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try {

                System.out.println("<--IN ThreadEx2 class--->");
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}



public class MultiThreadEx3{

    public static void main(String[] args)throws InterruptedException{

        ThreadEx obj = new ThreadEx();
        obj.start();
       // obj.sleep(1000);

       // obj.join();

        ThreadEx2 obj2 = new ThreadEx2();
        // obj.join();
        obj2.start();



    }

}