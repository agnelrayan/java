package com.expertzlab.interfaceex;

abstract class Department{
    int id;
    String name;
    abstract void display();

    public void message(){
        System.out.println("In Abstract Class--Concreate method..");
    }
}

class StudentBranch{


   /* void display(){
        System.out.println("In StudentBranch--Abstract Method");

   }*/
}

public class Student {
    public static void main(String[] args) {
        Department obj = new Department() {
            @Override
            void display() {
                System.out.println("In Display --Abstract Method..");
            }
        };
        obj.display();
        obj.message();
    }
}
