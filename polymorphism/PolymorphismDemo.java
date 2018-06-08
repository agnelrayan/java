package com.expertzlab.polymorphism;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class PolymorphismDemo {

    public static void main(String[] args) {
        List<FlyingMachines2> machines = new ArrayList<FlyingMachines2>();
        machines.add(new FlyingMachines2());
        machines.add(new Jett());
        machines.add(new Helicopterr());
        machines.add(new Jett());

        new MakeThingsFly().letTheMachinesFly(machines);
    }
}

class MakeThingsFly {
    public void letTheMachinesFly(List<FlyingMachines2> flyingMachines) {
        for (FlyingMachines2 flyingMachine : flyingMachines) {
            flyingMachine.fly();
        }
    }
}

class FlyingMachines2 {
    public void fly() {
        out.println("No implementation");
    }
}

class Jett extends FlyingMachines2 {
    @Override
    public void fly() {
        out.println("Start, taxi, fly");
    }

    public void bombardment() {
        out.println("Fire missile");
    }
}

class Helicopterr extends FlyingMachines2 {
    @Override
    public void fly() {
        out.println("Start vertically, hover, fly");
    }
}
