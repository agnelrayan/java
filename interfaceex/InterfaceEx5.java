package com.expertzlab.interfaceex;

/**
 * Created by geo on 26/9/17.
 */

interface Shape1{
    abstract public void draw1();
}
interface Shape2 extends Shape1{
    void draw2();
}
interface Shape3 {
    void draw3();
}

class Circle implements Shape1,Shape2,Shape3{
    public void draw1(){
        System.out.println("In Shape1 - Draw1 Method");
    }

    public void draw2(){
        System.out.println("In Shape2 - Draw2 Method");
    }

        public void draw3(){
        System.out.println("In Shape3 - Draw3 Method");
    }

}


public class InterfaceEx5 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw1();
        obj.draw2();
        obj.draw3();




    }
}
