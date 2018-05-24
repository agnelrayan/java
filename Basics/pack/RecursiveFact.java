package com.expertzlab.Basics.pack;

/**
 * Created by agnel on 5/4/18.
 */
public class RecursiveFact {

    public static int fact(int f){
       // int n=0;
        if(f==1)
            return 1;
        else
            return(f*fact(f-1));
    }

    public static void main(String[] args) {
        System.out.println("Factorial:"+fact(4));
    }
}
