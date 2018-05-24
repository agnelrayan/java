package com.expertzlab.sample3;

/**
 * Created by agnel on 5/9/18.
 */
public class StaticblockEx {

    public static void m(){
        System.out.println("Static Method...");
    }

    static{
        System.out.println("Static block is initialized...");
    }


    public static void main(String[] args) {

        System.out.println("In Main Method...");

        m();
    }
}
