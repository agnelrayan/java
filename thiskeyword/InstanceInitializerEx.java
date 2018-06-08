package com.expertzlab.thiskeyword;


class Instance{

    int studentId;

    static{
        System.out.println("In Parent class static block");
    }

    {
       // studentId=10;
        //System.out.println("Id:"+studentId);
        System.out.println("Parent Class instance block--1");
    }

    {
        System.out.println("Instance block in Parent class---2");
    }

    {
        System.out.println("Instance block in Parent class---3");
    }
    Instance(){
        System.out.println("Parent class Constructor...");
    }

    void message(){
        System.out.println("In Instance class--Message Method...");
    }

}

class Instance2 extends Instance{

    public Instance2(){
        //super();
        System.out.println("In Child class constructor");
    }

    {
        System.out.println("Instance block in child class--1");
    }
    {
        System.out.println("Instance block in child class--2");
    }
    {
        System.out.println("Instance block in child class--3");
    }
 /*   static{
        System.out.println("In Child class static block");
    }*/

}


public class InstanceInitializerEx {
    public static void main(String[] args) {
        Instance obj = new Instance();
        obj.message();
        Instance obj2 = new Instance();
        Instance2 obj3 = new Instance2();

    }
}
