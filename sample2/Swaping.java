package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class Swaping {
    public static void main(String[] args) {
        int a=30;
        int b=60;
        System.out.println("Before Swapping:"+a+","+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping:"+a+","+b);

    }

}
