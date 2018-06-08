package com.expertzlab.Basics;

/**
 * Created by agnel on 2/26/18.
 */

/*Anonymous simply means nameless. An object which has no reference is known as anonymous object. It can be used at the time of object creation only.

        If you have to use an object only once, anonymous object is a good approach.*/


class Demo{
    Demo(){
        System.out.println("Default Constructor");
    }
    void display(){
        for(int i=0;i<=5;i++){
            System.out.println("Welcome to Anonymous Object");
        }
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new Demo().display();
        Demo obj = new Demo(),obj2= new Demo();
        obj.display();
        obj2.display();




    }
}
