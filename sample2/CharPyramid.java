package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class CharPyramid {
    public static void main(String[] args) {
        char i=0,j=0;
        char ch='a';
        for(i=0;i<=5;i++){
            for(j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
