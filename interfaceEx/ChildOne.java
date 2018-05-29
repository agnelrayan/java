package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 5/29/18.
 */
public class ChildOne implements Parent {

      public void walk() {
        System.out.println("Walk Method in Child1..");
    }

    public void talk() {
        System.out.println("Talk Method in Child1..");
    }

    public void smile() {
        System.out.println("Smile Method in Child1..");
    }

    public void setParentsName() {
        System.out.println("Parent Name is:"+parentsName);
    }

    public void eat(){
        System.out.println("Eat Method in Child1..");
    }
}
