package com.expertzlab.arrays;

import java.util.Arrays;

public class ArrayEx14 {
    public static void main(String[] args) {
        int[] a= new int[10];
        a[0]=10;
        a[1]=20;
        a[2]=15;
        a[4]=40;

        System.out.println("Without Length variable:");
        for(int i=0;i<=9;i++)
            System.out.print(a[i]+"\t");
        System.out.println();

        System.out.println("With Length variable:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");

        System.out.println();
        System.out.println("Using Enhanced for loop");
        for(int i:a)
            System.out.print(i+"\t");

        int b[] = new int[10];
        b=a;
        System.out.println();
        System.out.println("Copying array values from a to b:");
        for(int i:b)
            System.out.print(i+"\t");

        System.out.println();
        System.out.println("After Sorting:");
        Arrays.sort(b);

        for(int i:b)
            System.out.print(i + "\t");

        System.out.println();
        int sum=0;
           for(int i=0;i<a.length;i++)
            sum = sum + a[i];

        System.out.println("Sum:"+sum);

    }

}
