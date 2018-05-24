package com.expertzlab.innerclassex;

/**
 * Created by geo on 27/9/17.
 */

interface OuterInt{
  void display();
    public static interface InnerInt{
        void display2();
    }

}

class Main implements OuterInt.InnerInt{
    public void display(){
        System.out.println("IN display");
    }
    public void display2(){
        System.out.println("In display 2");
    }
}


public class NestedIntefaceEx {
    public static void main(String[] args) {
        OuterInt.InnerInt obj = new Main();
        //OuterInt obj2 = new Main();
        obj.display2();
        //obj2.display();
    }
}
