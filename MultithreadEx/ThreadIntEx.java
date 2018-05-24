package com.expertzlab.MultithreadEx;


class ThreadIntEx1 implements Runnable{

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            System.out.println('*');
            try {
                Thread.sleep(1500);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }

}

class ThreadIntEx2 implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1500);
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }
}


public class ThreadIntEx {
    public static void main(String[] args) throws InterruptedException{

       // ThreadIntEx1 obj = new ThreadIntEx1();
        //Thread t1 = new Thread(obj);
        Thread t1 = new Thread(new ThreadIntEx1(),"t1");
        Thread t3 = new Thread(new ThreadIntEx1(),"t3");

        t1.start();
        //t1.run();

        t1.join(1500);

        ThreadIntEx2 obj2 = new ThreadIntEx2();
        Thread t2 = new Thread(obj2);

        Thread t4 = new Thread(new ThreadIntEx2(),"t4");
        Thread t6 = new Thread(new ThreadIntEx2(),"t6");
        Thread t7 = new Thread(new ThreadIntEx2(),"t7");
        Thread t8 = new Thread(new ThreadIntEx2(),"t8");
        Thread t9 = new Thread(new ThreadIntEx2(),"t9");
        Thread t10 = new Thread(new ThreadIntEx2(),"t10");
        Thread t11 = new Thread(new ThreadIntEx2(),"t11");
        Thread t12 = new Thread(new ThreadIntEx2(),"t12");
        Thread t13 = new Thread(new ThreadIntEx2(),"t13");

        t2.start();
        t3.start();
        t4.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
       // t4.start();
        //Exception in thread "main" java.lang.IllegalThreadStateException
       // t1.start();
        //t2.run();
    }
}
