package multithreadex;

/**
 * Created by agnel on 6/7/18.
 */

class First {
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("First Thread...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Second{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Second Thread...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class MultiThreadEx {
    public static void main(String[] args) {
        First t1 = new First();
        t1.run();

        Second t2 = new Second();
        t2.run();
      //  t2.start();

    }
}
