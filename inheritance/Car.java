package com.expertzlab.inheritance;

class Vehicle{
    String vehicleType;
}
public class Car extends Vehicle {
    String modelType;

    public void showDetail(){
        vehicleType="Car";
        modelType="Sports";
        System.out.println(modelType+" "+vehicleType);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.showDetail();
    }
}
