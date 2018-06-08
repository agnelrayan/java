package com.expertzlab.arrays;


import java.util.Scanner;

public class ArrayEx22 {
    public static void main(String[] args) {
        // float sum=0,avg=0;
        int i;
        int n;
        int j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in array");
        n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements");
        for (i = 0; i < n; i++) {
            a[i] = in.nextInt();
            //  sum =sum+a[i];
            // System.out.println("Sum of Value:"+sum);
            //System.out.println("Array values:"+a[i]);
        }
        System.out.println("Before Sorting.....");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);

        }

        System.out.println("After Sorting......");
        for(i=0;i<n;i++){
            for(j=1;j<(n-i);j++){
                if(a[j-1]>a[j]){
                  //  System.out.println("a[j-1] values:"+a[j-1]);
                   // System.out.println("a[j] values:"+a[j]);
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;

                }
            }
        }

        /*for(i = 0; i < n; i++) {
            for(j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/

        for (j= 0; j < n; j++) {
            System.out.println(a[j]);

        }


    }
}
