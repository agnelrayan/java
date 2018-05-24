package com.expertzlab.innerclassex;
public class StaticNestedClass {
    private static String outer = "Outer Class"; //NestedClass instance variable
    InnerClass innerClass = new InnerClass();

    void getOuterS() {
        System.out.println(outer);
    }

    void getInnerS() {
        System.out.println(InnerClass.mysample);
    }

    InnerClass getInner() {
        return innerClass;
    }

    static class InnerClass {
        private static String mysample = "Inner Class"; //InnerClass instance variable,

        void getIn() {
            System.out.println(mysample);
        }

        void getOut() {
            System.out.println(outer); //access a static member

            StaticNestedClass staticNestedClass = new StaticNestedClass();
            staticNestedClass.getOuterS();
            staticNestedClass.getInnerS();

        }
    }

    public static void main(String[] args) {
        StaticNestedClass nestedClass = new StaticNestedClass();
        InnerClass nestedInner = nestedClass.getInner();
        nestedClass.getOuterS();
        nestedClass.getInnerS();
        nestedInner.getIn();
        nestedInner.getOut();
    }
}