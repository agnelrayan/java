package com.expertzlab.arrays;


public class ArrayEx7 {
    public static void main(String[] args) {
        int m[] = m();
        System.out.println("From Array of Integer Method:");
        for(int i=0;i<m.length;i++)
            System.out.println(m[i]);

        int m2[] =m2();
        System.out.println("From Array of Float Method");
        for(int j=0;j<3;j++)
        System.out.println(m[j]);
    }
    public static int[] m(){
        return new int[]{1,2,3,5,6,7,5};
        //return new int[]{1,2,3};
    }

    public static int[] m2(){
        return new int[]{2,323,54};
    }
}
