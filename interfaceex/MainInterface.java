package com.expertzlab.interfaceex;

interface Car2{
    public abstract void brake();
    void drive();
    void clutch();

}

interface Vehicle extends Car2{
    void speed();
    void color();
}

 class BMWs implements Vehicle{

    public void brake() {
        System.out.println("Brake in BMWs...");
    }

    public void drive() {

        System.out.println("Drive in BMWs");
    }

    public void clutch() {
        System.out.println("Clutch in BMWs");

    }

    public void design(){
        System.out.println("Design in BMWs");
    }

     public void speed() {
         System.out.println("Speed in BMWs");

     }

     public void color() {

         System.out.println("Colors in BMWs");
     }
 }


class Ferrari implements Car2{

    public void brake() {
        System.out.println("Brake in Ferrari..");

    }

    public void drive() {
        System.out.println("Drive in Ferrari..");

    }

    public void clutch() {
        System.out.println("Clutch in Ferrari...");

    }

    public void design(){
        System.out.println("Design in Ferrari...");
    }
}


public class MainInterface {
    public static void main(String[] args) {
        Car2 obj = new BMWs();
        Car2 obj2 = new Ferrari();
        obj.brake();
        obj.clutch();
        obj.drive();


        obj2.clutch();
        obj2.drive();
        obj2.brake();

        BMWs bmw = new BMWs();
        Ferrari fer = new Ferrari();
        bmw.design();
        fer.design();
        bmw.speed();
        bmw.color();



    }
}
