package com.expertzlab.inheritance;


class Bike {
    void display(){
        System.out.println("In Bike class");
    }
}
class Splender extends Bike{
    void display(){
        System.out.println("In Splender Class");
    }
    }

class CBZ extends Bike{
    void display(){
        System.out.println("In CBZ class");
    }
}
public class Main2{
    public static void main(String[] args) {
        Bike obj = new Splender();
        Bike obj2 = new CBZ();
        obj.display();
        obj2.display();
    }
}

