package com.expertzlab.ExceptionHandlingEx;

public class ExceptTest {
        public static void main(String[] args) {
            int a,n,b;
            a=10;
            b=0;
            String str="Ahg";
            int ar[] = new int[4];
            String str2="12";

            try {
                int i=Integer.parseInt(str2);
                System.out.println(i);
                System.out.println(ar[3]);
                System.out.println(str.length());
                n = a / b;//critical section
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormat Exception Handled...");

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException Handled...");
                   }
            catch(NullPointerException e){
                System.out.println("NullPointerException Handled...");

            }
            catch(ArithmeticException e){
                System.out.println("Handle Arithmetic Exception");
            }
            catch(Exception e){
                System.out.println("Hadle by General Exception");

            }

            System.out.println("Rest of the code");
            System.out.println("Rest of the code");
            System.out.println("Rest of the code");
            System.out.println("Rest of the code");
            System.out.println("Rest of the code");
            System.out.println("Rest of the code");

        }
}
