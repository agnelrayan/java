package com.expertzlab.interfaceEx;

interface Dove{
     void pureMethod();

}

public class InterfaceEx3  {
    public static void main(String[] args) {
        Dove obj = new Dove()
        {
            public void pureMethod(){
                System.out.println("In PUre Method..");
            }
        };
        obj.pureMethod();


    }
}
