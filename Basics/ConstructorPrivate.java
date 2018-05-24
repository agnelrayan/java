package com.expertzlab.Basics;

class A{
    private A(){}//private constructor
    void msg(){System.out.println("Hello java");}
}

public class ConstructorPrivate{
    public static void main(String args[]){
        //A obj=new A();//Compile Time Error
    }
}