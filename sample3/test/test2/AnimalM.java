package com.expertzlab.sample3.test.test2;

import com.expertzlab.sample3.test.Animal;

/**
 * Created by agnel on 5/16/18.
 */
public class AnimalM {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.talk();
        animal.walk();

        System.out.println();

        System.out.println("Object for Child Class...");

        Cat cat = new Cat();
        cat.eat();
        cat.walk();
        cat.talk();

        System.out.println();

        System.out.println("Ref. by Parent Class ...");

        Animal animal2 = new Cat();
        animal2.walk();
        animal2.talk();
        animal2.eat();



    }
}
