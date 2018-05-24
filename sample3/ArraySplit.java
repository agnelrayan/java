package com.expertzlab.sample3;

import java.util.Arrays;

/**
 * Created by agnel on 5/11/18.
 */
public class ArraySplit {
    public static void main(String[] args) {
        int ar[]=new int[]{10,20,40,50,30,60};
        int n=ar.length;
        int a[]=new int[n/2];
        int b[]=new int[n-a.length];

        for(int i=0;i<n;i++){
            if(i<a.length){
                a[i]=ar[i];
            }
            else
            {
                b[i-a.length]=ar[i];
            }
        }

        System.out.println("Arrays in A[i]:");

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("Arrays in B[i]:");

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
       // System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(b));
    }
}
