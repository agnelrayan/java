package com.expertzlab.arrays;
public class ArrayEx4 {
    public static void main(String[] args) {
        int[] ar=new int[5];
        ar[0]=1;
        ar[2]=10;

        for(int i=0;i<ar.length;i++)
        System.out.println("ar[]:"+ar[i]);

        for(int j:ar)
            System.out.println("Using Enhanced for loop:"+j);

    }
}
