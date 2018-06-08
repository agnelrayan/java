package com.expertzlab.ExceptionHandlingEx;


public class ThrowEx12 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not valid to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }

    }
    public static void main(String[] args) {
        validate(19);

    }
}
