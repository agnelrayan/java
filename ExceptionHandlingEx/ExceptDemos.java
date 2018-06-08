package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by agnel on 5/28/18.
 */
public class ExceptDemos {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 1;
        int d = 0;
        String str2 = "fd";
        String str = null;
        int ar[] = new int[5];


        try {

            try {

                d = Integer.parseInt(str2);


            } catch (NumberFormatException e) {
                System.out.println("NumberFormat Exception...");

            }

            try {
                ar[6] = 10;
                System.out.println(ar[6]);
            } catch (Exception e) {
                System.out.println("ArrayIndex Out of Bound Exception..");

            }
            try {
              //  c = a / b;
              //  System.out.println(c);
                System.out.println(str.length());
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception...");

            }




        } catch (Exception e) {
            System.out.println("General Exception...");
        }

        System.out.println("Error Occured...");
        System.out.println("Calculated the value...");
        System.out.println(c);
        System.out.println(d);

    }

}
