//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
package com.expertzlab.inheritance;

class ParentClass{
    protected void display(){
        System.out.println("In Parent Method");
    }
}
public class Child2 extends ParentClass {
    protected void display(){
        System.out.println("IN Child Method");
    }
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.display();
    }
}
