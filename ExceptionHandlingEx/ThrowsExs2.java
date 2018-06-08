package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by agnel on 6/8/18.
 */
public class ThrowsExs2 {
    public static void main(String[] args){
        int ar[] = new int[5];
try {
    System.out.println(ar[5]);
}
catch(Exception e){
    System.out.println("Exception are Handled...");

}

        System.out.println("Allow me to Continue...");
        System.out.println("Allow me to Continue...");
        System.out.println("Allow me to Continue...");
        System.out.println("Allow me to Continue...");
    }
}
