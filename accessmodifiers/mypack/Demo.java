package com.expertzlab.accessmodifiers.mypack;

class ModifierTest{
    static public int a=10;
    void display(){
        System.out.println("A:"+a);
    }
}

public class Demo {
    public static void main(String[] args) {
        ModifierTest obj = new ModifierTest();
        obj.display();
        int i=obj.a=20;
        System.out.println("I:"+i);
    }
}
