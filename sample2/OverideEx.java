package com.expertzlab.sample2;

class A{
    public int intVal = 1;
    public void identifyClass()
    {
        System.out.println("I am class A");
    }
}

class B extends A
{
    public int intVal = 2;
    public void identifyClass()
    {
        System.out.println("I am class B");
    }
}

public class OverideEx
{
    public static void main(String [] args)
    {
        A a = new A();
        B b = new B();
        A aRef;
        aRef = a;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
        aRef = b;
        System.out.println(aRef.intVal);
        aRef.identifyClass();
    }
}
