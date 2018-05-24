package com.expertzlab.sample3;

import java.util.Arrays;

/**
 * Created by agnel on 5/16/18.
 */
public class SelectionSortEx {
    public static void main(String[] args) {
        int ar[] = {10,12,11,9,2,3,1};
        int n = ar.length;


        for(int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++) {
                if (ar[j] < ar[min]) {

                    min = j;
                }

            }
                    int temp=ar[min];
           // System.out.println("Temp:"+temp);
                    ar[min]=ar[i];
           // System.out.println("ar[MIN]:"+ar[min]);
                    ar[i]=temp;
           // System.out.println("ar[i]:"+ar[i]);




        }
        System.out.println(Arrays.toString(ar));
    }
}
