package com.expertzlab.interfaceex;

abstract class AbstractClass {

    abstract void someMethod();
    public void someMethod2(){
        System.out.println("abstract class");
    }
}

public class TestClass {

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {
            public void someMethod() {
                System.out.println("concrete class method");
            }
        };
        abstractClass.someMethod();
        abstractClass.someMethod2();
    }
}
