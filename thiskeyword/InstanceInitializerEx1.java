package com.expertzlab.thiskeyword;

/**
 * Created by geo on 25/9/17.
 */

class InstanceParent{


    static{
        System.out.println("Static Initializer block");
    }
    public InstanceParent(){
        System.out.println("In Parent Constructor");
    }


    {
        System.out.println("In Parent Instance Initializer");
    }

    /*static{
        System.out.println("Static Initializer block--2");
    }*/

}
public class InstanceInitializerEx1 extends InstanceParent{
    /*{
        System.out.println("IN Instance Initializer-1");
    }*/
    public InstanceInitializerEx1(){
        System.out.println("In Child--Constructor");
    }
    static{
        System.out.println("IN Child class --Static block");
    }
    /*{
        System.out.println("IN Instance Initializer-2");
    }*/
    public static void main(String[] args) {
        InstanceInitializerEx1 obj = new InstanceInitializerEx1();
        InstanceInitializerEx1 obj2 = new InstanceInitializerEx1();

    }
}
