package com.expertzlab.TypeCasting;

public class TypeCastingEx6 {
    public static void main(String[] args) {
        int a=10;
        long b = (int)a;//implicit
        System.out.println(b);

        int c=(int)b;///explicit
        System.out.println(c);

        float f=(float)50.50;
        float f2 = 50.60f;

    }
}
