package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class CompareToEx {
    public static void main(String[] args) {
        String str="ag";
        String str2="Ag";
        String str3 ="Ala";
        String str4 ="AG";
        String str5 ="";

        int i=str.compareTo(str2);
        System.out.println(i);//0

        int j = str.compareTo(str3);
        System.out.println(j);//negative

        int k = str3.compareTo(str);
        System.out.println(k);//positive

       /* int l = str.compareToIgnoreCase(str4);
        System.out.println(l);//0

        boolean m = str.equalsIgnoreCase(str4);
        System.out.println(m);//true

        boolean n = str.equals(str4);
        System.out.println(n);//false

        int o = str.compareTo(str5);
        System.out.println(o);//positive

        int p = str5.compareTo(str);
        System.out.println(p);//negative*/


        }
    }

