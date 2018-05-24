package com.expertzlab.innerclassex;

/**
 * Created by geo on 6/10/17.
 */
public class LocalMethodEx {
    static{

        class LocalInner{
            void display(){
                System.out.println("IN display");
            }

        }
        LocalInner obj = new LocalInner();
        obj.display();
    }

    void messsage(){
        System.out.println("In message");
    }
    public static void main(String[] args) {
        LocalMethodEx obj= new LocalMethodEx();
        obj.messsage();
    }
}
