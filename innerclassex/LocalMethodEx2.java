package com.expertzlab.innerclassex;

/**
 * Created by geo on 6/10/17.
 */
public class LocalMethodEx2 {

    {

        class LocalInner{
            void display(){
                System.out.println("In display");
            }
        }

        LocalInner obj2 = new LocalInner();
        obj2.display();

    }

    void message(){
        System.out.println("IN Messagge");
    }

    public static void main(String[] args) {
        LocalMethodEx2 obj = new LocalMethodEx2();
        obj.message();
       // LocalMethodEx2 obj2 = new LocalMethodEx2();
    }
}
