package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 9/10/17.
 */
public class ExceptEx10 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int ar[] = {1,3,2};
        String str =null;
        try {

            ar[5]=10;
            int i=str.length();
            int c = a / b;
            System.out.println(c);
        }

        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("ArrayIndex Out of bounds Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Ex..");
        }
        catch(NullPointerException ex){
            System.out.println("Null pointer Ex..");

        }
            System.out.println("Allow this line to execute1");
            System.out.println("Allow this line to execute2");
            System.out.println("Allow this line to execute3");
            System.out.println("Allow this line to execute4");
            System.out.println("Allow this line to execute5");


    }
}
