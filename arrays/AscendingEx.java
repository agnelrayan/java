package com.expertzlab.arrays;


import java.util.Scanner;

public class AscendingEx {
    public static void main(String[] args) {
        int n,temp;
        int i;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        n=obj.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();

        }

      /*  for(i=0;i<n;i++) {
            System.out.println(a[i]);

        }*/
       // System.out.println("After Sorting:");
        for(i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[j] = a[i];
                    a[j] = temp;
                }
            }
        }
                System.out.println("After Sorting:");
                for(i=0;i<n-1;i++){
                    System.out.println(a[i]+",");
                }
                System.out.print(a[n - 1]);

            }
        }


