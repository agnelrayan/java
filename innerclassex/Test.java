package com.expertzlab.innerclassex;

class A {

    public static void display(){
        System.out.println("in static method of A");
    }

    public void display2(){
        System.out.println("In Not static Metho of A");
    }

}

class B extends A {

    void show(){
        display();
    }

    public static void display(){
        System.out.println("in static method of B");
    }

}
public class Test {

    public static void main(String[] args){
        B obj =new B();
        obj.show();

        A a_obj=new B();
        a_obj.display();
        a_obj.display2();
        a_obj.display();


    }


}
