package com.expertzlab.accessmodifiers.mypack;
import com.expertzlab.accessmodifiers.pack.A;
public class B extends A{

    public static void main(String[] args) {
       // A obj = new A(300);
        //B obj2 = new B(400);
       // A obj =
        B obj = new B();//compile time error
        obj.msg();
        obj.display();
        obj.display2();
    }
}
