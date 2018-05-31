package com.expertzlab.interfaceex;

/**
 * Created by agnel on 2/28/18.
 */
public class MainAnimal {
    public static void main(String[] args) {
        Animal cowobj = new Cow();
        cowobj.run();
       // cowobj.color();
        cowobj.sound();
        cowobj.walk();

        Animal catobj = new Cat();
        catobj.run();
        catobj.sound();
        catobj.walk();

    }
}
