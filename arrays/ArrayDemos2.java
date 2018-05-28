package com.expertzlab.arrays;

/**
 * Created by agnel on 5/24/18.
 */
public class ArrayDemos2 {
    public static void main(String[] args) {
        int a[]={10,20,40,30,50};

        System.out.println("Enhanced For loop...");
        for(int b:a){
            System.out.println(b);

        }
        System.out.println("Using length variable...");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
