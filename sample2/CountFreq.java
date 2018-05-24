package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class CountFreq {

    public static void freq(int a[],int n){

        int i=0;
        while(i<n) {
            if (a[i] <= 0) {
                i++;
                continue;
            }

            int ei = a[i] - 1;

            if (a[ei] > 0) {
                a[i] = a[ei];
                a[ei] = -1;
            } else {
                a[ei]--;
                a[i] = 0;
                i++;
            }
        }
            System.out.println("Counts for the elements...");
            for(int j=0;j<n;j++)
                System.out.println(j+1+"->"+Math.abs(a[j]));



    }


    public static void main(String[] args) {
        int a[] ={5,2,3,4,2};
        int n=a.length;
        freq(a,n);
    }
}
