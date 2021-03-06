package com.expertzlab.innerclassex;

public class NestedClass {
    private String outer = "Outer Class"; //NestedClass instance variable
    InnerClass innerClass = new InnerClass();

    void getOuterS(){
        System.out.println(outer);
    }
    void getInnerS(){
        System.out.println(innerClass.mysample);
    }
    class InnerClass{
        private String mysample = "Inner Class"; //InnerClass instance variable,
        NestedClass a = NestedClass.this;
        void getIn(){
            System.out.println(mysample);
        }
        void getOut(){
            System.out.println(a.outer);
        }
    }
    public static void main(String[] args){
        NestedClass nestedClass = new NestedClass();
        InnerClass nestedInner = nestedClass.innerClass;
        nestedClass.getOuterS();
        nestedClass.getInnerS();
        nestedInner.getIn();
        nestedInner.getOut();
    }


}
