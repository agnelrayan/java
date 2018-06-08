package com.expertzlab.arrays;


import java.util.Scanner;

public class ArrayEx21 {
    public static void main(String[] args) {
     float sum=0,avg=0;
        int i;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the No. of Elements you want in array");
        n=in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements");
        for(i=0;i<n;i++){
            a[i]=in.nextInt();
            sum =sum+a[i];
           // System.out.println("Sum of Value:"+sum);
        }
        System.out.println("Sum of Value:"+sum);

        avg=sum/n;
        System.out.println("Average:"+avg);

    }


}
