package com.expertzlab.polymorphism;
class Animal{
    void sound()
    {
        System.out.println("Animal is making a sound");
    }
}
class Cat extends Animal{
    protected void sound()
    {
        System.out.println("Meow");
    }
}
public class Horse extends Animal{
    public void sound()
    {
        System.out.println("Neigh");
    }



    public static void main(String[] args) {
    //    Horse obj = new Horse();
        Animal obj2 = new Horse();
        Animal obj3 = new Animal();
        Animal obj4 = new Cat();
      //  obj.sound();
        obj2.sound();
        obj3.sound();
        obj4.sound();
    }
}
