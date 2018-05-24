package com.expertzlab.inheritance;

/**
 * Created by geo on 24/9/17.
 */

class ParentSuper{
    String name="ABC";
    void display()
    {
        System.out.println("IN Parent Method");
        System.out.println("Name:"+name);
    }

}

class Child3 extends ParentSuper{
    public void child3Method(){
        System.out.println("In Child3 --Method");
    }
}

class Child4 extends Child3{
    public void child4Method(){
        System.out.println("In Child4--Method");
    }
}

public class InheritancEx2 extends ParentSuper {
    public void details() {
        System.out.println("IN Child Method");

    }

    public static void main(String[] args) {
        InheritancEx2 obj = new InheritancEx2();
        obj.display();
        obj.details();

       Child4 obj2 = new Child4();
        obj2.child3Method();
        obj2.child4Method();

        ParentSuper obj4 = new ParentSuper();
        obj4.name="xyz";
        obj4.display();


    }
}