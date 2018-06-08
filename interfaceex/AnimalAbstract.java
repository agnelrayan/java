package com.expertzlab.interfaceex;

/**
 * Created by agnel on 2/28/18.
 */
public abstract class AnimalAbstract {
    abstract void sound();
    abstract void run();
    void walk(){
        System.out.println("Walk method in Animal class");
    }

}
