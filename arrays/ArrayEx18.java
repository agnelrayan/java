package com.expertzlab.arrays;


public class ArrayEx18 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
