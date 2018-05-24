package com.expertzlab.WrapperClass;

/**
 * Created by agnel on 2/27/18.
 */
public class Demo8 {
    public static void main(String[] args) {
        String str="12";
        int i = Integer.parseInt(str);

        //System.out.println(i+200);
       // System.out.println(str+200);

        char ch[]={'a','b','c','d','e'};
        for(int i1=0;i1<=ch.length-1;i1++){
            System.out.println(ch[i1]);


        }

        int i2=100;
        String str2=String.valueOf(i2);
        System.out.println(str2);

        String str3 = Integer.toString(i2);


    }
}
