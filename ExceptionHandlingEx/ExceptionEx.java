package com.expertzlab.ExceptionHandlingEx;


public class ExceptionEx {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            try {

                int[] arr = new int[3];
                arr[4] = 10;//array index out of bounds except..
                System.out.println("Fifth Element value" + arr[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsEx...");
            }

            try {
                int c = a / b;//critical section//arithmetic excepti..
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Arithemetic Exception");
            }

            try {
                String str = null;//null pointer except..
                System.out.println(str.length());

            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception");
            }

            try{
                String str="abc";
                int i=Integer.parseInt(str);
                System.out.println(i);
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormatExc...");
            }

        }


        catch(Exception e){
            System.out.println("not NuLL pt ex and not Arithemetic Ex.. and not ArrayIndexOut of bounds Ex..");
        }
        finally{
            System.out.println("In Finally block....");
            System.out.println("In Finally block....");
        }

        System.out.println("Execute this line");
        System.out.println("Execute this line");
        System.out.println("Execute this line");
        System.out.println("Execute this line");
        System.out.println("Execute this line");
        System.out.println("Execute this line");
    }



}
