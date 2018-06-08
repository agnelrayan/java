package com.expertzlab.polymorphism;

public class Test {
    int a,b;
    Test(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equals(Test o){
        if(o.a==a && o.b==b)
        return true;
        else
            return false;


    }

    public static void main(String[] args) {
        Test obj = new Test(10,20);
        Test obj2 = new Test(10,20);
        System.out.println("Obj==obj2"+obj.equals(obj2));
    }
}
