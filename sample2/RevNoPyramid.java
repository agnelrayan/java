package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class RevNoPyramid {

    public static void main(String[] args) {
        int i=0,j=0;

        for(i=0;i<=5;i++){
            for(j=0;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
        for(i=5;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }

    }
}
