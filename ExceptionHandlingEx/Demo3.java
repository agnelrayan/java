package com.expertzlab.ExceptionHandlingEx;


import com.expertzlab.Strings.StringFormatEx;

public class Demo3 {
    public static void main(String[] args) {
        try{
            try{
                int a=0;
                int b=5,c;
                c=b/a;

            }
            catch(ArithmeticException e){
                System.out.println("ARithmetic Exception..");

            }

            try{
                String str="Ag";
                int i=Integer.parseInt(str);

            }
            catch(NumberFormatException e){

                System.out.println("Number Format Exception");
            }

            try{

                int ar[] ={1,2,3};
                System.out.println(ar[4]);

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out Of Bound Exception..");

            }
        }
        catch(Exception e){
            System.out.println("General Exception..");
        }
        finally {
            System.out.println("Is It Error..?");
        }

        }
    }

