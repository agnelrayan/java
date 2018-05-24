package com.expertzlab.TypeCasting;

/**
 * Created by geo on 22/9/17.
 */
public class TypeCastEx1 {
    public static void main(String[] args) {
       Number n =1000;


        long l =100;
        int i=(int )l;
        System.out.println(i);

        double d =l;
        System.out.println(d);


       // Integer j =(Integer)n;
        Integer j = (Integer)n;
        System.out.println(j);

        float f =100.25f;
        int ii = (int)f;
        System.out.println(ii);

        char ch='a';
     System.out.println("Char value:"+ch);
        int jj = ch;
        System.out.println(jj);


    }

}
