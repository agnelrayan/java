package com.expertzlab.sample3;

/**
 * Created by agnel on 5/14/18.
 */
public class ArrayM {
    public static void main(String[] args) {
        int a[][]=new int[][]

                {{2,2,2},{2,2,2}};

        int b[][] = {{2,2,2},{2,2,2}
        };

        int c[][] = new int[2][3];

        int i,j;



        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
               // System.out.print(a[i][j]+" ");
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }


    }
}
