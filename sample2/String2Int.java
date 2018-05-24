package com.expertzlab.sample2;

/**
 * Created by agnel on 5/8/18.
 */
public class String2Int {
    public static void main(String[] args) {
        String str="123";
        System.out.println(str+100);
        int i = Integer.parseInt(str);
        System.out.println(100+i);

        String str2 ="230.30";
        float f = Float.parseFloat(str2);
        System.out.println(f);

        String str3 = "434343.3434";
        double d = Double.parseDouble(str3);
        System.out.println(d);
    }
}
