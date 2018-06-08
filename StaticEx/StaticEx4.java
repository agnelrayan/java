package com.expertzlab.StaticEx;

//Access static member from within the same class
class StaticEx4 {
    static int staticVariable = 10;
    void m() {
        StaticEx4 o = null;
        int i1 = staticVariable;
        int i2 = this.staticVariable;
        int i3 = StaticEx4.staticVariable;
        int i4 = o.staticVariable;
        System.out.println(i1);
        System.out.println();
        System.out.println(i2);
        System.out.println();
        System.out.println(i3);
        System.out.println();
        System.out.println(i4);

    }
}

//Access static member from outside the class

class MyObject2 {

    void m() {
        StaticEx4 o = new StaticEx4();
        int i5 = StaticEx4.staticVariable;
        int i6 = o.staticVariable;
        System.out.println(i5);
        System.out.println();
        System.out.println(i6);
    }

    public static void main(String[] args) {

        MyObject2 obj = new MyObject2();
        obj.m();

    }

}