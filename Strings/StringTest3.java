package com.expertzlab.Strings;

/**
 * Created by agnel on 3/5/18.
 */
public class StringTest3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        int k = str.capacity();
        System.out.println("K:"+k);
        int j=str.capacity();
        System.out.println("J:"+j);
        str.append("cochin");
        System.out.println(str);
        int i=str.capacity();
        System.out.println("Capacity"+i);

        StringBuilder str2 = new StringBuilder("expertzlab");
        str2.append("cohin");
        System.out.println(str2);


    }
}
