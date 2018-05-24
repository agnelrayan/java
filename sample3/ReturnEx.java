package com.expertzlab.sample3;

/**
 * Created by agnel on 5/9/18.
 */
public class ReturnEx {
    int speed;
    String name;
    int maxSpeed=120;
    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    public void diplayMaxSpeed(){
        System.out.println("Maximum Speed: "+maxSpeed);
    }

    public static void main(String[] args) {
        ReturnEx obj = new ReturnEx();
        obj.speed=100;
        int i=obj.getSpeed();
        System.out.println("Speed:"+i);

        obj.name="Bike";

        String str=obj.getName();
        System.out.println("Name of Vehicle: "+str);

        obj.diplayMaxSpeed();

    }
}
