package com.expertzlab.StaticEx;

class StaticMethod
{
    static int instVar = 10;
    static int staticVar = 20;

    public static void staticMethod ()
    {
        //You can not access instVar directly.
        System.out.println(instVar); //error: Cannot make a static reference to the non-static field instVar

        System.out.println(staticVar);

        StaticMethod smObject = new StaticMethod();
        System.out.println(smObject.instVar);
    }
}


public class StaticMethodDemo
{
    public static void main(String[] args)
    {
        StaticMethod.staticMethod();
    }
}