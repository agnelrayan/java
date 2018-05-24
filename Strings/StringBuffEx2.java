package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringBuffEx2 {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer();
        int i=str.capacity();

        System.out.println(i);
        str.ensureCapacity(i);
        System.out.println(i);

        str.append("helo");

        int j = str.capacity();
        System.out.println(j);

        str.append("Cochin is nice city in India");
        int k = str.capacity();
        System.out.println(k);
        str.ensureCapacity(k);
        System.out.println(k);

    }
}
