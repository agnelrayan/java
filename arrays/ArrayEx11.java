package com.expertzlab.arrays;
public class ArrayEx11 {
    public static void main(String[] args) {
        int arr[]={3,4,5,33,10,20};
        min(arr);

    }

    public static void min(int arr[]) {


        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];


        }
        System.out.println(min);
    }






    }



