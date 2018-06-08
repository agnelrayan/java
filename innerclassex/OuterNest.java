package com.expertzlab.innerclassex;
public class OuterNest {

    static int staticid=10;
    String name="Ag";
    void outerMethod(){
        System.out.println("In Outer Method");
    }
    static void staticOuterMethod(){
        System.out.println("In Outer Static Method");
        System.out.println("Outerclass Members:"+staticid);
        //System.out.println(name);
    }

    static class InnerNest{
        static int staticid2=20;
        String name2="ABC";
     void innerMethod(){
         System.out.println("InnerClass Member:"+staticid2);
         System.out.println("OuterClass Member access by Inner Class Method:"+staticid);
         System.out.println(name2);
         //System.out.println(name);
     }

        static void staticInnerMethod(){
            System.out.println("Outer class Member access by inner class static Method:"+staticid);
            System.out.println("InnerClass static Method accessing inner class static Member:"+staticid2);
          //  System.out.println(name2);
            //System.out.println(name);

            OuterNest outerNest = new OuterNest();
            outerNest.outerMethod();
           OuterNest.staticOuterMethod();

        }
    }


    public static void main(String[] args) {

        //accessing Innerclass method by Innerclass object
        InnerNest innerNest = new InnerNest();
        innerNest.innerMethod();
        InnerNest.staticInnerMethod();

        //calling outer method by OuterNest object
        //OuterNest outerNest = new OuterNest();
        //outerNest.outerMethod();
        //OuterNest.staticOuterMethod();

    }

}
