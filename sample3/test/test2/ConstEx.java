package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/17/18.
 */
public class ConstEx {
    static final int a;
    final int b;

    static{a=20;
        System.out.println("a:"+a);}


    ConstEx(){
        b=20;
        System.out.println("B:"+b);
    }

    public static void main(String[] args) {
        //a=20;
        System.out.println(a);
       // System.out.println(b);

        ConstEx ob = new ConstEx();
    }
}
