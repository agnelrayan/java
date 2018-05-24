package com.expertzlab.ExceptionHandlingEx;

import com.expertzlab.inheritance.ArithmeticEx;

/**
 * Created by geo on 9/10/17.
 */
public class Exceptex {
    public static void main(String[] args) throws ArithmeticException {
        int i=0;
        int j=5;
        int k=j/i;
        throw new ArithmeticException("ArithmeticException Occurred");
        //System.out.println("Allow me to continue");
    }

}
