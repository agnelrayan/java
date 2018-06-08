package com.expertzlab.Strings;

/**
 * Created by agnel on 3/28/18.
 */
public class StringDemos {
    public static void main(String[] args) {
        String str="java";
        String str2 ="java";

       // str=str.concat("J2ee");
        //System.out.println(str);


        String str3 = new String("java");

        System.out.println(str==str2);//true
        System.out.println(str.equals(str2));//true
        System.out.println(str==str3);//false
        System.out.println(str.equals(str3));//true

        StringBuffer str4 = new StringBuffer("java");
        str4.append("J2EE");
        System.out.println(str4);

        StringBuilder str5 =new StringBuilder("Java");
        str5.append("J2EE");
        System.out.println(str5);

    }


}
