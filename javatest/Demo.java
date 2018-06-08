package com.expertzlab.javatest;

class Demo2{
    void display(){
        System.out.println("IN Display Method...");
    }

}



public class Demo extends Demo2 {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.display();

        int a;
        int b;
        int c;
        a=10;
        b=20;
        c=a+b;

        System.out.println("Sum of value:"+c);


    }
}
