package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/21/18.
 */
public class FibEx {
    public static void fib(int x){
        int x1=0;
        int x2=1;
        int x3=0;
        System.out.println("X1:"+x1+"X2:"+x2);

        for(int i=2;i<=x;i++) {
            x3 = x1 + x2;

            System.out.println("X3:"+x3);
            x1 = x2;
            x2 = x3;

        }



    }

    public static void main(String[] args) {
        int x=0;
        fib(5);
    }
}
