package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */
public class ThrowEx {
    public static void validate(int age) throws Exception{
        if(age<18)
            throw new ArithmeticException("Not Valid to Vote");
        else
            System.out.println("Welcome To vote");

    }



    public static void main(String[] args) throws Exception{

        validate(16);
       // divide(0);
        System.out.println("Allow me to Continue");
    }
}
