package com.expertzlab.innerclassex;

/**
 * Created by geo on 27/9/17.
 */

class OuterSample{
    interface Inner{
    void display();

    }

}

class OuterImp implements OuterSample.Inner{
    public void display(){
        System.out.println("IN display method");
    }
    public static void main(String[] args) {
        OuterSample.Inner obj = new OuterImp();
        OuterImp obj2 = new OuterImp();
        obj.display();
        obj2.display();
    }
}


public class NestClassIntEx {

}
