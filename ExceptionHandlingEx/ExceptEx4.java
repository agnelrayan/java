package com.expertzlab.ExceptionHandlingEx;

// Handle an exception and move on.
import java.util.Random;
class ExceptEx4 {
    public static void main(String args[]) {

        int a=0, b=0, c=0;
        Random r = new Random();
        for(int i=0; i<5; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 10 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a = 0; // set a to zero and continue
            }
            System.out.println("a: " + a);
        }
    }
}