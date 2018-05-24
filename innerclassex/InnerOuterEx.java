package com.expertzlab.innerclassex;

class OuterClass {

    private int privInt = 10;


    public void createInnerClass() {

        InnerClass inClass = new InnerClass();
        inClass.accessOuter();
    }


    class InnerClass {

        public void accessOuter() {

            System.out.println("The outer class's privInt is " + privInt);

        }

    }


}

public class InnerOuterEx{
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.createInnerClass();
    }
}