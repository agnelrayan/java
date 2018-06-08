package com.expertzlab.interfaceex;



interface Car{
    void drive();
    void gear();
    void breake();
}

class Bmw implements Car{
    public void drive(){

        System.out.println("IN driver method-BMW");

    }

    public void gear(){
        System.out.println("IN Gear Method-BMW");

    }

    public void breake(){
        System.out.println("In Break Method -BMW");
    }
    public void display(){
        System.out.println("In Display Method BMW");
    }

}
class Benz implements Car{
    public void drive(){

        System.out.println("IN driver method--Benz Car");
    }

    public void gear(){
        System.out.println("IN Gear Method --Benz");

    }

    public void breake(){
        System.out.println("In Break Method--Benz");
    }

}




public class InterfaceEx2 {
    public static void main(String[] args) {
        Car obj = new Benz();
        obj.breake();
        obj.drive();
        obj.gear();

        Car obj2 = new Bmw();
        obj2.gear();
        obj2.drive();
        obj2.breake();

    }
}
