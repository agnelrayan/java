package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */
public class NestedTryEx {

    public static void main(String[] args) {
        try {
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("It is Array Index OutOfBounds Exception..");
            }
            try {

                int a[] = {2, 3, 4};
                a[5] = 10;
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("It is Arithmetic Exception");
            }
            try {

                String str=null;
                int i = str.length();
            }
            catch(Exception ex){
                System.out.println("Java Null pointer Exception");
            }
        }
        catch (Exception e) {
            System.out.println("Outer Catch Block");
        }
        finally{
            System.out.println("In Finally Block");
        }

        System.out.println("Allow me to Continue");
    }
}