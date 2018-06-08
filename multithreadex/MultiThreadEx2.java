package multithreadex;

/**
 * Created by agnel on 6/8/18.
 */

class Third{
    synchronized static public void print(int j) throws InterruptedException {
      //  synchronized (this)
        {
            for (int i = 0; i < j; i++) {
                System.out.println("i:" + (i * j));
                Thread.sleep(1500);
            }
        };
    }

}

class Fourth extends Thread{
    Third t4;

    public Fourth(Third t4){
        this.t4=t4;

    }
    public void run(){
        try {
            t4.print(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Fifth {
    Third t5;

    public Fifth(Third t5){
        this.t5=t5;

    }

   /* public void run(){
        try {
            t5.print(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

}

public class MultiThreadEx2 {
    public static void main(String[] args) {
        Third t = new Third();
        Fourth fourth = new Fourth(t);
        fourth.start();
       Thread t1 = new Thread(){
           public void run(){
               try {
                   t.print(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }

       };
       t1.start();


    }
}
