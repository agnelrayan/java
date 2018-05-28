package com.expertzlab.sample2.interfaceex;

/**
 * Created by agnel on 5/24/18.
 */
public class Car implements Vehicle {

    public void drive() {
        System.out.println("In Drive Car");
    }

    public void wheel() {
        System.out.println("In Wheel Car");

    }

    public void speed() {
        System.out.println("IN Speed Car");
        System.out.println("Maximum Speed:"+maxSpeed);

    }
}
