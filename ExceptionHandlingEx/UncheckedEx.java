package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */
public class UncheckedEx {
    public static void main(String[] args)  {
        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2;

            System.out.println(num3);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic....");
        }
        System.out.println("Allow me to Continue");

    }
}
