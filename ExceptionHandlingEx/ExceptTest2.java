package com.expertzlab.ExceptionHandlingEx;

public class ExceptTest2 {
    public static void main(String[] args) {

        String str = null;
        int a, b;
        a = 10;
        b = 0;
        int ar[] = new int[5];
        try {
            //a = a / b;

            try {

                System.out.println(str.length());
            }
            catch (NullPointerException e) {
                System.out.println("NullPointer Exception Handled");
            }
            finally{
                System.out.println("Finally in Inner catch block 1----");
            }
            try {
                System.out.println(ar[6]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds Exceptions Handled");

            }
            finally{
                System.out.println("Finally in Inner catch block 2----");
            }
        } catch (Exception e) {
            System.out.println("Handle by General Exception");

        }
        finally{
            System.out.println("In Finally Block....");
        }

        System.out.println("Rest of the code....");
        System.out.println("Rest of the code....");
        System.out.println("Rest of the code....");
        System.out.println("Rest of the code....");
    }

}
