package com.expertzlab.sample2.interfaceex;

/**
 * Created by agnel on 5/24/18.
 */
public class VehicleM {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Vehicle v2 = new Bike();

        System.out.println("Methods of Car...");
        v.drive();
        v.speed();
        v.wheel();

        System.out.println("Methods of Bike");
        v2.wheel();
        v2.speed();
        v2.drive();
    }
}
