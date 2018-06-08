package com.expertzlab.innerclassex;
class StaticEx{
    static private int id=10;
    private static String name="XYZ";
    static public double marks=90.90;

    void display(){

        System.out.println("In Display(Outer Class) Non-Static Method");
    }

    static void display2(){

        System.out.println("In (OUter Class)Static Method");
        System.out.println(name);
       // System.out.println(id);
    }


    static class StaticInEx{
        static int roll=100;
        static String sname="AG";
        static void methodStatic(){
            System.out.println(name);
            System.out.println(id);
            System.out.println(marks);
            System.out.println(roll);
        }
        static void innerClassMethod()
        {
            System.out.println("Method in Nested Static");
        }

        void nonStaticMethod(){
            System.out.println("IN Non static Method");
        }

    }
}


public class StaticInnerEx {
    public static void main(String[] args) {
       /*StaticEx obj = new StaticEx();
        obj.display();
        StaticEx.display2();*/

        StaticEx.StaticInEx obj2 = new StaticEx.StaticInEx();
        obj2.methodStatic();
        StaticEx.StaticInEx.methodStatic();
        //StaticEx.StaticInEx.methodStatic();

        String s=StaticEx.StaticInEx.sname="Paul";
        System.out.println(s);

        obj2.innerClassMethod();
        obj2.nonStaticMethod();

        StaticEx.display2();













    }
}
