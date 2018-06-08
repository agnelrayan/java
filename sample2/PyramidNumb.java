package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class PyramidNumb {
    public static void main(String[] args) {
        int i,j=0,rows=5;
        for(i=0;i<=rows;i++){
            for(j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
