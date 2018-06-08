package com.expertzlab.StaticEx;

class One
{
    final static int field1 = 10;
}

class Two
{
    final static int field2 = 10;
   // final static int field3=20;
}

class Three
{
    static int field3;

    // static block gets executed only once 
    // when class is initialized
    static
    {
        int one = One.field1;
        int two = Two.field2;
        field3 = one + two;
    }

   /* static
    {
        int a = Two.field2;
        int b = One.field1;
    }*/
    public static void printField3()
    {
        System.out.println(field3);
    }
}

public class StaticInitDemo
{
    public static void main(String[] args)
    {
        Three.printField3();

    }
}