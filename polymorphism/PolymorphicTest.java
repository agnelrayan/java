package com.expertzlab.polymorphism;

import java.util.List;

class FlyingMachines {
    public void fly() {
        System.out.println("No implementation");
    }
}

class Jet extends FlyingMachines {
    public void fly() {
        System.out.println("Start, Jet, Fly");
    }
}

class FighterPlan extends FlyingMachines {
    public void fly() {
        System.out.println("Start, Fighter, Fight");
    }
   /* public void fly(List<FlyingMachines> flyingMachines) {
        for (FlyingMachines flyingMachine : flyingMachines) {
            flyingMachine.fly();
        }
    }*/
}

public class PolymorphicTest {
    public static void main(String[] args) {
        FlyingMachines flm = new Jet();
        flm.fly();

        FlyingMachines flm2 = new FighterPlan();
        flm2.fly();

    }
}
