package com.expertzlab.sample2.interfaceex;

/**
 * Created by agnel on 5/24/18.
 */
public class CarsM {
    public static void main(String[] args) {
        Cars c = new Benz();
        Cars c2 = new BMW();
        System.out.println("Methods in Benz...");
        c.brake();
        c.drive();
        c.speed();

        System.out.println("<-------->");

        System.out.println("Methods in BMW...");
        c2.speed();
        c2.drive();
        c2.brake();
    }
}
