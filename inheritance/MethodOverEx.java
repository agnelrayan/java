package com.expertzlab.inheritance;


class MethodParent{
    int speedLimit=90;
    protected void display(){
        System.out.println("In Parent Method");
    }
}
public class MethodOverEx extends MethodParent{
    int speedLimit=150;
    public void display(){
        System.out.println("In Child Method");
    }

    public static void main(String[] args) {

        MethodParent obj = new MethodOverEx();
        //System.out.println(obj.speedLimit);
        System.out.println(obj instanceof MethodParent);
        obj.display();
    }
}
