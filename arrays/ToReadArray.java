package com.expertzlab.arrays;


import java.util.Scanner;

public class ToReadArray {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];
        int n=5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for(i = 0;i<a.length;i++) {
            String token = scan.next();
            a[i] = Integer.parseInt(token);
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
