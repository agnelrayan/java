package com.expertzlab.ExceptionHandlingEx;


public class Demo4 {
    public static void validate(int i) throws Exception{
        if(i>17){
            System.out.println("Eligible for Vote..");
        }

        else{
            throw new ArithmeticException("Not Valid");
        }
    }
    public static void main(String[] args) throws Exception{
        try {

            validate(10);
        }
        catch(Exception e){
            System.out.println("Error..");
        }

    }
}
