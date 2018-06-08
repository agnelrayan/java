package com.expertzlab.ExceptionHandlingEx;


public class Demo {
    public static void main(String[] args) throws ArithmeticException{
        int a=0;
        System.out.println("Is it Running?");
        int b=5,c;
        c=b/a;
        /*try {
            c = b / a;
        }
        catch(ArithmeticException e){
            System.out.println("Error...");
        }*/
        System.out.println("Run...");
        System.out.println("Allow to Run...");
        System.out.println("Run...");
        System.out.println("Allow to Run...");
        System.out.println("Run...");
    }
}
