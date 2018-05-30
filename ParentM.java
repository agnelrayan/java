package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 5/29/18.
 */
public class ParentM {
    public static void main(String[] args) {
        Parent p = new ChildOne();
        Parent p2 = new Child2();

        System.out.println("Child One Behaviours...");
        p.smile();
        p.talk();
        p.walk();
        System.out.println();

        System.out.println();
        System.out.println("Child Two Behaviours...");
        p2.walk();
        p2.talk();
        p2.smile();
        System.out.println();

        System.out.println("Child One Behaviours...");
        ChildOne c = new ChildOne();
        c.eat();
        c.smile();
        c.talk();
        c.walk();
        System.out.println();


        System.out.println("Child2 Behaviours...");
        Child2 c2 = new Child2();
        c2.smile();
        c2.talk();
        c2.think();
        c2.walk();
    }
}
