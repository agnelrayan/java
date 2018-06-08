package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */

class Parent{
    void message() throws Exception{
        System.out.println("In Message--Parent Class");
    }


}
public class MethodOverExce extends Parent {
    void message() throws ArithmeticException {

        System.out.println("In Child Class Method");

    }
    public static void main(String[] args) {

        MethodOverExce obj = new MethodOverExce();
        obj.message();

    }
}
