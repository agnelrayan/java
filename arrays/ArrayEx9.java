package com.expertzlab.arrays;
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] intArr={3,4,5};
        int[] intClone=intArr.clone();
        System.out.println(intArr==intClone);

        for(int i=0;i<intArr.length;i++)
            System.out.print(intArr[i]+" ");
        System.out.println();

        System.out.println("After Cloning values:");

        for(int i=0;i<intClone.length;i++)
            System.out.print(intClone[i]+" ");
        System.out.println();

        System.out.println("Comparing shallows:");

        System.out.println(intArr[0]==intClone[0]);
        System.out.println(intArr[1]==intClone[1]);


    }
}
