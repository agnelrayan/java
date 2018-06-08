package com.expertzlab.inheritance.mypack;

/**
 * Created by agnel on 5/23/18.
 */
public class VehicleM {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
      //  v.clutch();
     //   v.drive();
        v.wheel();

        System.out.println("Method Overriding...");

        v=new Car();
        v.wheel();
    //    v.drive();
   //     v.clutch();

        Swift s = new Swift();
        s.clutch();
        s.drive();
        s.speed();
        s.wheel();
    }
}
