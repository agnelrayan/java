package com.expertzlab.polymorphism;

class Adder2{
    static int add(int a, int b)
    {
        return a+b;

    }
    static long add(long a, long b)
    {
          return a+b;
    }
}
class TestOverloading2{
    public static void main(String[] args)
    {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(120,120));

    }
}
