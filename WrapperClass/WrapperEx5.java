package com.expertzlab.WrapperClass;

public class WrapperEx5 {
    public static void main(String[] args) {
        int i =50;
        Integer integer1 = Integer.valueOf(i);
        System.out.println("Integer1:"+integer1);//boxing
        Integer integer2 = i;
        System.out.println("Integer2:"+integer2);

        double d =90.90;
        Double double1 = Double.valueOf(d);
        System.out.println("Double1:"+double1);
        Double double2 = d;//internally will add method valueOf
        System.out.println("Double2:"+double2);

        //unboxing

        //wrapper class into primitive data type

        Integer integer3=50;
        int int2 = integer3;//internally will add the method Integer.intValue()

        int int3 = integer3.intValue();
        System.out.println("Int3:"+int3);




    }
}
