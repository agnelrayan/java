package com.expertzlab.ExceptionHandlingEx;

import java.io.IOException;

/**
 * Created by agnel on 6/8/18.
 */
public class ThrowsExs3 {
    public static void validate(int age) throws Exception {

        if(age>17)
            System.out.println("You are eligible to vote...");

        else
            try {
                throw new Exception("Sorry Friend, You are not Eligible...");
            }
            catch(ArithmeticException e){
            throw e;

            }
    }
    public static void main(String[] args) throws Exception {

        validate(17);
    }
}
