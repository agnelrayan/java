package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class Cow extends Animal {
   public void eat(){
       System.out.println("Animal can eat Plants --Cow");
   }

    public static void main(String[] args) {
        Cow c = new Cow();
        c.walk();
        c.eat();

        Animal a = new Animal();
        a.walk();
        a.eat();

        Animal a2 = new Cow();
        a2.walk();
        a2.eat();

        Cat cat = new Cat();
        cat.talk();


    }
}
