package com.expertzlab.interview;


public class MethodOverload {
    void call(int a,int b){
        System.out.println("int a and int b");
    }

    void call(Integer a, Integer b){
        System.out.println("Integer a & Integer b");

    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.call(2,3);
        obj.call(new Integer(10),new Integer(20));
        obj.call(10,20);
    }
}
