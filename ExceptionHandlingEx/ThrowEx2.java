package com.expertzlab.ExceptionHandlingEx;
public class ThrowEx2{
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try {
            validate(16);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}