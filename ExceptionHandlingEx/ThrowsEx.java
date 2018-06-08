package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.IOException;

/*throws keyword is required only for checked exception
and usage of throws keyword for unchecked exception is meaningless.*/
public class ThrowsEx {

    public static void number(int i,int j) throws ArrayIndexOutOfBoundsException,ArithmeticException{
        if(i==1&&j==1)
        {
            int a=5;
            int b=0;
            int c=a/b;
            throw new ArithmeticException("Arithmetic Exception");
        }
        else{
            int a[]={3,4,5};
            a[5]=10;
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException..");
        }

    }

    public static void main(String[] args) {
        try {
            number(1,1);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Allow me to Continue");
    }
}
