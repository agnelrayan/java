package com.expertzlab.polymorphism;
class Adder{
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {return a+b+c;
    }
   void add(Adder obj2){
       System.out.println("Object parameter");
   }
    void add(Adder obj2,int a){
        System.out.println("Object parameter");
        System.out.println("integer value:"+a);
    }
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

        Integer a=20;
        Adder obj2 = new Adder();
        obj2.add(a,10);
    }
}
