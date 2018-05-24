package com.expertzlab.sample2.fileex;

/**
 * Created by agnel on 5/16/18.
 */
public class ArrayLen {
    public static void main(String[] args) {
        int ar[] = new int[10];
        for(int i=0;i<10;i++){
            ar[i]=i;
        }

        int[] kr = new int[15];
        System.arraycopy(ar,0,kr,0,10);
        ar=kr;

        for(int i=10;i<15;i++)
            ar[i]=i;

        for(int k=0;k<15;k++)
            System.out.printf("%d ,",ar[k]);
    }
}
