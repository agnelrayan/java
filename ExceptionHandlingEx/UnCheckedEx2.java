package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */
public class UnCheckedEx2 {
    public static void main(String[] args) {
        try{

            int a[] ={2,4,3,1};
            a[5]=10;
           // System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundEx...");
        }
        System.out.println("Allow me to Continue");
    }
}
