package com.expertzlab.innerclassex;

/**
 * Created by geo on 27/9/17.
 */

interface AnonClass{
      void display();
        //abstract void display2();

       /* void message()
        {
            System.out.println("In Message Body--Concreate class");
        }*/


        }
public class AnonymousEx {
    public static void main(String[] args) {
        AnonClass obj =     new AnonClass() {
            public void display() {
                System.out.println("Inside Anonymous Class Method");
            }

        };

        obj.display();
       // obj.message();

    }
}
