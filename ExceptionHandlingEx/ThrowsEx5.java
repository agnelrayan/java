package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 5/10/17.
 */
public class ThrowsEx5 {
    public static void main(String[] args) {

        try {
            int a = 5;
            int b = 1;
            int c = a / b;
            System.out.println(c);

            int d[] = new int[4];
            d[4]=10;
            System.out.println(d[4]);



        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Ex...");
        }
        catch(ArrayIndexOutOfBoundsException ee){
            System.out.println("ArrayIndexOut...");
        }
        System.out.println("Allow me to run");
    }
}