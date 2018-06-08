package com.expertzlab.MultithreadEx;


class First extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("First Thread.....");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }

}
class Second extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Second Thread.....");
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }

    }

}
public class Demo {
    public static void main(String[] args)
    {
        First t = new First();
        Second t2 = new Second();
        t.start();
    try

    {
        //t.join();
    }
        catch(Exception e)
        {

            System.out.println(e);
        }

            t2.start();
        t2.start();

    }
}
