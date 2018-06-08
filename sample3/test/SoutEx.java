package com.expertzlab.sample3.test;

/**
 * Created by agnel on 5/17/18.
 */
public class SoutEx {
    public static void main(String[] args) {
        System.out.println("Helo World");
        System.out.println("Helo \n World");
        System.out.println("Helo \"Helo!\" \"fine\" World");

        System.out.printf("%.2f",4.0/3.0);
        System.out.println();

        String str = String.format("%3d",5/2);
        System.out.println(str);

        String str2 ="AB";
        //System.out.println(String.format("[%5s]",str2));
       // System.out.println("'" + String.format("%5.5s", "123") + "'");
       // System.out.println("'" + String.format("%-5.5s", "1234567890.....") + "'");
        String sf3=String.format("value is %32.12f",32.33434);
        System.out.println(sf3);

        String gfg3 = String.format("%7s", str2);

        System.out.println(gfg3);

    }
}
