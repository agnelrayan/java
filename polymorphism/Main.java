package com.expertzlab.polymorphism;

public class Main
{
    private Main(Object o)
    {
        System.out.println("Object");
    }

    private Main(double[] da)
    {
        System.out.println("double array");
    }

    public static void main(String[] args)throws Exception
    {
        Main main = new Main(null);
    }
}