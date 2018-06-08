package com.expertzlab.sample3;

import java.util.Arrays;

/**
 * Created by agnel on 5/15/18.
 */
public class ArraySplit2 {
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50,60};
        int n=ar.length;
        int a[] = new int[n/2];
        System.out.println("A[]:"+Arrays.toString(a));
        int b[] = new int[n-a.length];
        System.out.println("B[]:"+Arrays.toString(b));
        for(int i=0;i<ar.length;i++){
            if(i<a.length)
                a[i]=ar[i];
            else
                b[i-a.length]=ar[i];
        }

        System.out.println("Elements in a[]..");
      /*  for(int j=0;j<a.length;j++) {

            System.out.println(a[j]);
        }

        System.out.println("Elements in b[]..");
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }*/
        System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
    }
}
