package com.expertzlab.sample2;

/**
 * Created by agnel on 5/15/18.
 */
public class OverLoadEx {
    public static void main(String[] args) {
        callme(10.5f,10);
    }

    static void callme(int x,float y){
        System.out.println("Inside int and float accept Method...");
    }

    static void callme(float x, int y){
        System.out.println("Inside float and int accept Method...");
    }
}
