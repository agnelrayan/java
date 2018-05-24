package com.expertzlab.thiskeyword;

public class Gfg2
{
    // Initializer block starts..
    {
        // This code is executed before every constructor.
        System.out.println("Common part of constructors invoked !!");
    }
    // Initializer block ends

    public Gfg2()
    {
        System.out.println("Default Constructor invoked");
    }
    public Gfg2(int x)
    {
        System.out.println("Parametrized constructor invoked");
    }
    public static void main(String arr[])
    {
        Gfg2 obj1, obj2;
        obj1 = new Gfg2();
        obj2 = new Gfg2(0);
    }
}