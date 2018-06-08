package com.expertzlab.ExceptionHandlingEx;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        try {

            int arr[] = new int[3];
            arr[4]=10;

            String str =null;
            int j=str.length();


            FileInputStream in = new FileInputStream("ac3232.txt");
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);

            }
        }


        catch(NullPointerException e){
            System.out.println("NullPointer Exception...");
        }

        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Allow me to Run");
        System.out.println("Allow me to Run");
        System.out.println("Allow me to Run");
    }
}
