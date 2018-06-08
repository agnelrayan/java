package com.expertzlab.sample2;

import org.bouncycastle.util.Arrays;

/**
 * Created by agnel on 5/16/18.
 */
public class ArCopy {
    public static void main(String[] args) {
        int[] ar =new int[10];
        for(int c=0;c<10;c++){
            ar[c]=c;
        }

        int[] kr = Arrays.copyOf(ar,10);

        //System.out.println(kr);
        //System.out.println(ar);

        for(int k=0;k<10;k++)
            ar[k]=ar[k]*2;

        for(int i=0;i<10;i++)
            System.out.printf("%d, ",kr[i]);
        System.out.println();

        for(int i=0;i<10;i++)
        System.out.printf("%d, ",ar[i]);
    }
}
