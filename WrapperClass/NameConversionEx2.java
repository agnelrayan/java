package com.expertzlab.WrapperClass;

public class NameConversionEx2{
    public static void main(String args[]){
        int i=200;
        float f=300;
        String s=String.valueOf(i);
        System.out.println(f);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }}