package com.expertzlab.Basics;


public class FactRecursive {

    public static int factorial(int n){
        if(n==0)
            return 1;
        else{
            //System.out.println(n);
            return (n*factorial(n-1));

        }

    }

    public static void main(String[] args) {
        int n=4;
        int fact =factorial(n);
        System.out.println(fact);


    }
}
