package com.expertzlab.thiskeyword;


public class ThisEx4 {
    public void display()
    {
        System.out.println("In Display Method"+this);
    }
    public static void main(String[] args)
    {

        ThisEx4 obj = new ThisEx4();
        obj.display();
        System.out.println("IN Main Method"+obj);
    }
}
