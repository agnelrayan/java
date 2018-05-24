package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by geo on 4/10/17.
 */
public class MultipleCatchEx {
    public static void main(String[] args) {

        int b=5;
        int c=0;
        String str=null;


        try{
            int i=str.length();
            System.out.println(i);
            int d=b/c;
            int a[]={2,3,5,6};
            a[6]=10;
            System.out.println("In try block");

        }
        catch(NullPointerException np){
            System.out.println("NullPointer Exception..");
        }

        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception...");

        }
       catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndexOutOf...");
        }

        catch(Exception ee){
            System.out.println("Exception...");
        }
    }
}
