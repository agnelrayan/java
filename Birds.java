package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 4/7/18.
 */

interface Bird{
    void fly();
}
class Parrot implements Bird{

    public void fly() {
        System.out.println("Fly in Parrot...");
    }
}

class Birds{
    public static void main(String[] args) {

        Parrot obj = new Parrot();
        obj.fly();

    }
}
