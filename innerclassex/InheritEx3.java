package com.expertzlab.innerclassex;

/**
 * Created by agnel on 4/6/18.
 */

class Animal{

    public void walk(){
        System.out.println("Animal walk...");
    }

    public void eat(){
        System.out.println("Animal eat...");
    }

}

class Dog extends Animal{
    public void sound(){
        System.out.println("LOL>>>>>LOLL....");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Meow....Meow...");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Amme...Amme...Amme");
    }
}

public class InheritEx3 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.walk();
        obj.sound();

        Cat obj2 = new Cat();
        obj2.eat();
        obj2.walk();
        obj2.sound();

        Cow obj3 = new Cow();
        obj3.eat();
        obj3.walk();
        obj3.sound();

    }
}
