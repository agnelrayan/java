package com.expertzlab.polymorphism;

class Overload {
    void demo(int a) {
        System.out.println("a:" + a);
    }

    int demo(int a, int b) {
        System.out.println("a and b" + a + " " + b);
        return a * b;
    }

    double demo(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }

    static void demo(int a, double b) {
        System.out.println("a:" + a +" "+ "b:" + a);
       // return 0;
    }


    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);
        System.out.println("O/P:" + result);
        demo(10, 20.50);

    }
}


