package com.expertzlab.arrays;

/**
 * Created by agnel on 4/24/18.
 */
public class ThirdMax {
    public static void main(String[] args) {
        int a[] = {10,22,20,50,1,40};
        int fmax=0;
        int smax=0;
        int tmax=0;

        int i;
        for(i=1;i<a.length;i++) {


            if (a[i] > tmax) {
                tmax = a[0];
                if(smax>tmax){
                    smax=tmax;
                    if(fmax>smax)
                        fmax=smax;
                }
            }

        }
        System.out.println("Tmax" + tmax);
    }
}
