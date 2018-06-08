package com.expertzlab.arrays;

import java.util.Arrays;

public class DemoSplitArray {
    public static void main(String[] args) {
        int input[] ={10,22,30,40,50};
        int n=input.length;
        int i;

        int a[] = new int[n/2];
        int b[] = new int[n-a.length];
        //System.out.println("Before Iteratign:"+Arrays.toString(x));

        for(i=0;i<n;i++){
            if(i<a.length)
                a[i]=input[i];
            else
               // b[i-a.length]=input[i];
                b[i-a.length]=input[i];

        }



        System.out.println("Split 1:"+ Arrays.toString(a));
        System.out.println("Split 2:"+Arrays.toString(b));

    }
}
