package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class Pyramid {
    public static void main(String[] args) {

        int n=3;
        pyramid(n);

    }
    public static void pyramid(int n){
        int i,j=0;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++) {

                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
