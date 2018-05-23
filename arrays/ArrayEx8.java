package com.expertzlab.arrays;


public class ArrayEx8 {
    public static void main(String[] args) {
        byte byteArr[] ={1,2,3};
        short shortArr[]={10,20,30};
        int intArr[]={100,200,300};
        String strArr[]={"Ag","Ray","JOy"};

        System.out.println(byteArr.getClass());
        System.out.println(shortArr.getClass());
        System.out.println(intArr.getClass());
        System.out.println(byteArr.getClass().getSuperclass());
        System.out.println(strArr.getClass());
    }
}
