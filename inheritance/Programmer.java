package com.expertzlab.inheritance;


class Employee{

    int id=10;
    String name="Ray";




     void display(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class Programmer extends Employee {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.display();

        programmer.id=20;
        programmer.name="Jesu";
        programmer.display();
    }

}
