package com.expertzlab.sample2.interfaceex;

/**
 * Created by agnel on 5/24/18.
 */
public class Bike implements Vehicle {
    public void drive() {
        System.out.println("Drive in Bike");
    }

    public void wheel() {
        System.out.println("Wheel in Bike");
    }

    public void speed() {
        System.out.println("Speed in Bike");
        System.out.println("Maximum Speed:"+maxSpeed);
    }

    public void bikeMethods(){
        System.out.println("Bike Methods....");
    }
}
