package com.expertzlab.arrays;


import java.util.Arrays;

public class ArrayEx10 {
    public static void main(String[] args) {
        int intArr[]={3,4,5,6,7,8,1,3,5,6,10,20,10,30,40,29};

       Arrays.fill(intArr, 0, 4, 2);
        System.out.println("Array filled with 0 "+"from 0 to 3 => \n" + Arrays.toString(intArr));

      System.out.println("Sorting 0 to 7:");
        Arrays.sort(intArr);
        System.out.println("Partially Sorted:"+Arrays.toString(intArr));

     System.out.println(Arrays.toString(intArr));
        System.out.println("Binary search position 3:");
        int i=Arrays.binarySearch(intArr,1);
        System.out.println("Binary Search:"+i);


       // System.out.println(intArr.toString());
       // System.out.println(intArr);
        /*System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr));*/

       /*System.out.println("Sorting 0 to 7:");
        Arrays.sort(intArr,0,7);
        System.out.println("Partially Sorted:"+Arrays.toString(intArr));*/

       // int index = Arrays.binarySearch(intArr,4);
       // System.out.println("Position of 9 in sorted:"+index);





       /* System.out.println("Array Sorting:");
        Arrays.sort(intArr);
        System.out.println("Completely Sorted:"+Arrays.toString(intArr));

        // Sort the complete array in ascending order
        // so that Binary Search can be applied
        Arrays.sort(intArr);

        // To search for a particular value(for eg 9)
        // use binarysearch method of arrays
        int index = Arrays.binarySearch(intArr,4);
        System.out.println("Position of 9 in sorted:"+index);

        // Copy the whole array
        int[] copy = Arrays.copyOf(intArr, intArr.length);
        System.out.println("Copied array => \n" + Arrays.toString(copy));

        // Copy a specified range into a new array.
        int[] rcopy = Arrays.copyOfRange(intArr, 1, 5);
        System.out.println("Copied subarray => \n" + Arrays.toString(rcopy));

        // To fill a range with a particular value
        Arrays.fill(intArr, 0, 5, 0);
        System.out.println("Array filled with 0 "+"from 0 to 3 => \n" + Arrays.toString(intArr));

        // To fill complete array with a particular
        // value
        Arrays.fill(intArr, 10);
        System.out.println("Array completely filled"+" with 10=>\n"+Arrays.toString(intArr));*/



    }
}
