package com.expertzlab.sample2;

import java.util.Arrays;

/**
 * Created by agnel on 5/8/18.
 */
public class Split2 {
    public static void main(String[] args) {
        int ar[] ={10,20,30,40,50,60};
        int n=ar.length;
        int a[] =new int [n/2];
        int b[] = new int[n-a.length];

        for(int i=0;i<ar.length;i++){
            if(i<a.length){
                a[i]=ar[i];
            }
            else
            {
                b[i-a.length]=ar[i];
            }
        }
        System.out.println("A[i]:"+ Arrays.toString(a));
        System.out.println("B[i]:"+Arrays.toString(b));


    }
}
