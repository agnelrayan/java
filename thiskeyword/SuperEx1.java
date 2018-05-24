package com.expertzlab.thiskeyword;

class SuperParent{
    int id=10;
    String name="Parent-Name";
    public void display()
    {
        System.out.println("Id:"+id+" "+name);
    }
    public SuperParent()
    {
       // this.id=id;
        System.out.println("In SuperParent Constructor");
    }
}

public class SuperEx1 extends SuperParent{
    int id=100;
    String name="Child Name";
    public SuperEx1()
    {
        // super(1);
        // this();
        System.out.println("In Child Constructor");
        //super(1);
    }
    public void display()
    {
        super.display();
        super.id=20;
        super.name="Parent Name in child display";
        super.display();
        System.out.println("Child Parent Method");
        System.out.println("Id:"+id+" "+"Name:"+name);
    }
    public static void main(String[] args)
    {
        SuperEx1 obj = new SuperEx1();
        obj.display();
    }
}
