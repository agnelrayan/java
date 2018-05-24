package com.expertzlab.sample2;

/**
 * Created by agnel on 5/8/18.
 */
public class Prim2String {
    public static void main(String[] args) {
        int i=100;
        String str = Integer.toString(i);
        String str2 = String.valueOf(i);
        System.out.println("String One:"+str);
        System.out.println("String Two:"+str2);

        System.out.println(i+100);
        System.out.println(str2+i);

        float f =200.10f;
        String str3 = Float.toString(f);
        System.out.println("STring Three:"+str3);


    }
}
