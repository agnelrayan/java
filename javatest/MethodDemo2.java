package com.expertzlab.javatest;

/**
 * Created by agnel on 3/24/18.
 */
public class MethodDemo2 {
    static double c;

    public void add(int a,int b,int d){
        c=a+b+d;
        System.out.println("Addition value is:"+c);

    }

    public void sub(int a,int b){

        c=a-b;
        System.out.println("Sub is:"+c);


    }

    public void mul(int a,int b){
        c=a*b;
        System.out.println("Multiplication:"+c);

    }

    public void div(int a,int b){
        c=a/b;
        System.out.println("Division:"+c);

    }

    public void modulodiv(int x,int y){
        c=x%y;
        System.out.println("Modulo Division is:"+c);

    }

    public void area(int aa){

        c=3.14*aa*aa;
        System.out.println("Area is:"+c);
    }




    public static void main(String[] args){

        MethodDemo2 obj = new MethodDemo2();

        obj.add(10,20,30);
        obj.sub(20,10);
        obj.mul(10,20);
        obj.div(91,10);//9--quotient

        obj.modulodiv(91,10);//1--remainder
        obj.area(2);

    }
}
