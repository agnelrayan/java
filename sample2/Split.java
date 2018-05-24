package com.expertzlab.sample2;

import java.util.Arrays;

/**
 * Created by agnel on 5/7/18.
 */
public class Split {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int ar[] = {10,20,30,40,50,60};

        int n=ar.length;

        int a[] = new int[n/2];
        int b[] = new int[n-a.length];

        for(i=0;i<ar.length;i++){
            if(i<a.length){
                a[i]=ar[i];

            }
            else{
                b[i-a.length]=ar[i];
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        /*for(i=0;i<n/2;i++){
            System.out.println(ar[i]-a[i]);
        }

        int b[]= new int[ar[i]-a[i]];
        //System.out.println(b);
        for(j=0;j<b.length-1;j++)
            System.out.println(b[j]);*/





    }
}
