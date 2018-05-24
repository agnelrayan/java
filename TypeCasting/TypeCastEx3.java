package com.expertzlab.TypeCasting;

/**
 * Created by geo on 22/9/17.
 */
public class TypeCastEx3 {
    public static void main(String[] args) {
        int n=100;
        byte b = (byte) n;
        System.out.println("The value of b"+b);

        long l = n;
        System.out.println("The value of l"+l);

        float f =100.10f;
        int nn =(int)f;
        System.out.println(nn);

        char ch='b';
        int nnn = ch;
        System.out.println(nnn);

        long l2 = 1000;
        System.out.println(l2);

        double d = 20.10f;
        System.out.println(d);

        float f2 = (float)20.23;
        System.out.println(f2);

        long i =100l;
        int l3 =(int)i;



    }
}
