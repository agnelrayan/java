package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 5/29/18.
 */
public class Child2 implements Parent {
    public void walk() {
        System.out.println("Walk in Child2...");
    }

    public void talk() {
        System.out.println("Talk in Child2...");

    }

    public void smile() {
        System.out.println("Smile in Child2...");
    }

    public void setParentsName() {
        System.out.println("Parents Name:"+parentsName);
    }

    public void think(){
        System.out.println("Think in Child2...");
    }
}
