package com.expertzlab.arrays;


public class ArrayEx6 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        ArrayEx6.sum(arr);
    }

    public static void sum(int arr[]){

        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);


    }
}
