package com.expertzlab.arrays;


public class ArrayEx17 {
    public static void main(String[] args) {
        int a[] = new int[6];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[5]=60;

        for(int i:a){
            System.out.println(i);

        }

        System.out.println("Iterate by Length Instance");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("Iterate by for loop:");
        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }
    }

}
