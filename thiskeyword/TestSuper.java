package com.expertzlab.thiskeyword;

class Parent{

    int id=1;
    String name="John";
    int age=47;

   /* public Parent(){
        System.out.println("IN Parent class constructor");
    }*/
    public Parent(int id){
        System.out.println("IN Parent class Parameterized constructor");
        System.out.println("Id value:"+id);
    }

    public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

}
class Child extends Parent{
    int id=10;
    String name="Ag";
    public Child(){
        super(1);
        System.out.println("In Child class Constructor");
    }
    public void display(){
        super.display();
        System.out.println("Super class variable is:"+super.id);
        System.out.println("Super class variable is"+super.name);
        System.out.println("Child class id is:"+id);
        System.out.println("Child class name is:"+name);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();

    }
}
