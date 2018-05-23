package com.expertzlab.arrays;

/**
 * Created by agnel on 2/28/18.
 */
public class DemoArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=10;
        a[1]=20;


        System.out.println("Iterate using Normal For loop..");
        for(int i=0;i<=4;i++){
            System.out.println(a[i]);
        }

        System.out.println("Using Length instance variable");
        for(int j =0;j<a.length;j++)
            System.out.println(a[j]);

        System.out.println("Using enhanced For Loop");
        for(int k:a){
            System.out.println(k);
        }
    }
}
