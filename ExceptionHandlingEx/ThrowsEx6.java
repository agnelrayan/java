package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 8/10/17.
 */
public class ThrowsEx6 {
    static void add() throws ArithmeticException{

        int a=0;
        int b =6;
        int c=b/a;
       // throw new ArithmeticException("Arithmetic Ex..");
    }


    public static void main(String[] args) {
        try{

            add();
        }
        catch(Exception r){
            System.out.println("Exception");
        }
        System.out.println("Allow me to continue");
    }
}
