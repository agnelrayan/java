package com.expertzlab.interfaceEx;

abstract class Dove2{
    abstract void pureMethod();
    //abstract void pureMethod2();

}

public class AbstractEx4{
    public static void main(String[] args) {
        Dove2 obj = new Dove2()
        {
            public void pureMethod(){
                System.out.println("In PUre Method..");
            }
        };
        obj.pureMethod();


    }




}