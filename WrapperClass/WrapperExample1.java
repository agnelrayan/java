package com.expertzlab.WrapperClass;

public class WrapperExample1{
    public static void main(String args[]){
        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a+" "+i+" "+j);

        float b=30.30f;
        Float b2 = Float.valueOf(b);
        System.out.println("B2:"+b2);

        long l =43434343434l;
        System.out.println("L:"+l);

        int i2 =43434343;
        System.out.println("I2:"+i2);


    }}