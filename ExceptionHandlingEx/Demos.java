package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by agnel on 3/28/18.
 */
public class Demos {
    public static void main(String[] args) throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
        int a=5;
        int b=0;
        String str = null;

        int d[] = {10,20,30};
        try {
            int c = a / b;//arithmetic exception


        }
        catch(ArithmeticException e){
            System.out.println("Divide Zero");
        }
        try {
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("asking length for Null string");
            }

            try{
                System.out.println(d[5]);//ArrayIndexOutOfBound Exception
            }

            catch (Exception e){
                System.out.println("assigning value to the array");
            }

            finally{
                System.out.println("You have to execute....");
            }





    }
}
