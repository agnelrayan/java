package com.expertzlab.examples;


public class Cat {
    //data members of cat
    String color = "White";
    int eyes = 2;
    static String sound = "Meow";//class variable or static variable

    Cat(String color,int eyes,String sound) {
        this.color = color;
        this.eyes=eyes;
      //  this.sound=sound;
    }

    //member function of cat
    void walk() {
        int legs = 4;//local variable
        System.out.println("IN walk method");
        System.out.println("Local variable:"+legs);
    }


    void display() {
        System.out.println("Color:" + color);
        System.out.println("Eyes:" + eyes);
        System.out.println("Sound" + sound);
    }


    static void sound() {
        System.out.println(sound);

    }



    public static void main(String[] args) {

        Cat obj = new Cat("Yellow",2,"Meeooww");
        obj.walk();
        obj.display();

        System.out.println("After Changing the values");
        obj.color="Black";
        obj.eyes=1;
        Cat.sound="Meowwww";
        obj.display();
        System.out.println(sound);
        //System.out.println(eyes);
    }
}
