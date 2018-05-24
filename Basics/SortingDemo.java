package com.expertzlab.Basics;

import java.util.Scanner;

/**
 * Created by agnel on 3/5/18.
 */
public class SortingDemo {
    public static void main(String[] args)
    {

    Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number to sort");
    int input = obj.nextInt();
    int a[] = new int[input];
        System.out.println("Enter all the elements");
        for(int i = 0;i<a.length;i++)
    {
        a[i] = obj.nextInt();
    }

        System.out.println("Print the given elements");
        for(int i = 0;i<a.length;i++){
        System.out.println(" " + a[i]);

    }
    sort(a);
        System.out.println("After Sortting..");
        for(int i=0;i<a.length;i++){
            System.out.println(" "+a[i]);
        }

}
        public static void sort(int a[]){
            for(int i=0;i<a.length-1;i++){
                for(int j=0;j<a.length-1;j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
        }

    }

