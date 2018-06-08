package com.expertzlab.innerclassex;


class OuterEx2{
    static int id=10;
    String name="Ag";

    void nonStaticOuterMethod(){
        System.out.println("In outer method:----");
        System.out.println("Accessing Id in NonStaticOuter:"+id);
        System.out.println("Accessing Name in NonStaticOuter:"+name);
    }

    void staticOuterMethod(){
        System.out.println("In Static Outer Method:----");
        System.out.println("Accessing Id in StaticOuterMethod:"+id);
        System.out.println("Accessing Name is Static OuterMethod:"+name);
    }


    static class InnerEx2{
        int idd=20;
        static int iddd=30;
        void nonStaticInnerMethod(){
            System.out.println("In display Method");
            System.out.println(idd);
            System.out.println(id);
            System.out.println(iddd);

            OuterEx2 obj = new OuterEx2();
            obj.staticOuterMethod();
            obj.nonStaticOuterMethod();
            System.out.println("Outer Non Static Members:"+obj.name);

        }

        static void staticInnerMethod(){
            System.out.println("Static Inner Method");
        }

    }



}


public class StaticInEx2 {

    public static void main(String[] args) {
        OuterEx2.InnerEx2 obj = new OuterEx2.InnerEx2();
        obj.nonStaticInnerMethod();
        OuterEx2.InnerEx2.staticInnerMethod();

       // OuterEx2.InnerEx2.staticOuterMethod();
       // OuterEx2.InnerEx2.staticInnerMethod();



    }


}
