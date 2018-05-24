package com.expertzlab.TypeCasting;


public class TypeCastingEx5 {
    public static void main(String[] args) {
        int i =50;
        long l =(long)i;//implicit casting
        System.out.println("L:"+l);

        int i2=(int)l;//explicit casting
        System.out.println("I2:"+i2);

        float f =(float)50.5;
        double d =f;
        System.out.println("D:"+d);

        float f2=(float)d;
        System.out.println("F2:"+f2);

        float f3 =25.89f;
        int i3 =(int)f3;//explicit casting
        System.out.println("I3:"+i3);




    }
}
