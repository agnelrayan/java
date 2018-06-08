package com.expertzlab.WrapperClass;

/**
 * Created by geo on 4/10/17.
 */
public class WrapperEx3 {
    public static void main(String[] args) {
       // Float f =23.89f;
        Float f = new Float(23.89);

        byte b = f.byteValue();
        System.out.println(b);

        short s = f.shortValue();
        System.out.println(s);
    }
}
