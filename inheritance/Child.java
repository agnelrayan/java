package com.expertzlab.inheritance;

class Parent{
    public void display(){
        System.out.println("Parent Method");
    }
}
public class Child extends Parent {
    public void displayChild(){
        System.out.println("Child Method");
    }
    public static void main(String[] args) {
        Child obj = new Child();
                obj.displayChild();
                obj.display();


    }
}
