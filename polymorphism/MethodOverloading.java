package com.expertzlab.polymorphism;

public class MethodOverloading
{

    public static void main(int a, int b){

        System.out.println(a+b);

    }

    public static void main(String args[]){

        System.out.println("We are in MAIN Method");

        main(5,10);

    }

}
