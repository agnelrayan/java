package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class StaticVar {

     static final float s =100; //static variable shared to all objects
    public static void main(String[] args) {
        StaticVar s1 = new StaticVar();
        StaticVar s2 = new StaticVar();

        System.out.println(s1.s);
        //s1.s=200;
        System.out.println(s2.s);

        System.out.println(Math.PI);

    }


}
