package com.expertzlab.arrays;

import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {

        // initializing three long arrays
        long[] arr1 = new long[] { 150, 123, 12, 45, 54 };
        long[] arr2 = new long[] { 150, 123, 12, 45, 54, 67, 78 };
        long[] arr3 = new long[] { 150, 123, 12, 45, 54, 67, 78 };

        // comparing arr1 and arr2
        boolean retval=Arrays.equals(arr1, arr2);
        System.out.println("arr1 and arr2 equal: " + retval);

        // comparing arr2 and arr3
        boolean retval2=Arrays.equals(arr2, arr3);
        System.out.println("arr2 and arr3 equal: " + retval2);

        int[] ar4 = new int[]{10,20,30};
        int[] ar5 = new int[]{10,20,30,9};
        boolean result=Arrays.equals(ar4,ar5);
        System.out.println("Equal of ar4 & ar5:"+result);
    }
}
