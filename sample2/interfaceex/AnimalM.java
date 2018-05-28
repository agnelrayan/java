package com.expertzlab.sample2.interfaceex;

/**
 * Created by agnel on 5/24/18.
 */
public class AnimalM {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void talk() {
                System.out.println("Talk in Animal");
            }
        };
        a.talk();
    }
}