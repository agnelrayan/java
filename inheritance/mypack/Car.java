package com.expertzlab.inheritance.mypack;

/**
 * Created by agnel on 5/23/18.
 */
public class Car extends Vehicle {
    public void wheel(){
        System.out.println("Having Four Wheels....");
    }

    protected void speed(){
        System.out.println("Maximum I go 240KM...");
    }
}
