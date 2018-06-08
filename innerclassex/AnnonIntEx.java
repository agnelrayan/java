package com.expertzlab.innerclassex;

/**
 * Created by geo on 27/9/17.
 */

interface IntAnn{
    void display();
}

public class AnnonIntEx {
    public static void main(String[] args) {
        IntAnn obj = new IntAnn() {
            public void display() {
                System.out.println("Method Body of Annonymous Interface");
            }
        };
                obj.display();
    }
}
