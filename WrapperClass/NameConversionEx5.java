package com.expertzlab.WrapperClass;

public class NameConversionEx5 {
    public static void main(String[] args) {
        String str="200";
        int i = Integer.parseInt(str);
        System.out.println("I:"+i);
        System.out.println("String+100:"+str+100);//200100
        System.out.println("Integer+100:"+(i+100));//300


        double d = Double.parseDouble(str);
        System.out.println("Double value:"+d);
    }
}
