package com.expertzlab.WrapperClass;

public class NameConversionEx
{
    public static void main(String args[])
    {
        String s="200";
        int i=Integer.parseInt(s);
        float f = Float.parseFloat(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(f);

        String str ="abc";
        int ii = Integer.parseInt(str);
        System.out.println(str);
    }}
