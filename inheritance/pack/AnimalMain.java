package com.expertzlab.inheritance.pack;

/**
 * Created by agnel on 4/12/18.
 */

class Animal{
    public void sound(){
        System.out.println("Sound for Animal--->");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("LOLLL...LOOOL");
    }

}

public class AnimalMain {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
