package com.expertzlab.sample2;

import java.util.Random;

/**
 * Created by agnel on 5/8/18.
 */
public class ShuffleEx {
    public static void main(String[] args) {
        int ar[] = {10,20,30,40,50};
        int n=ar.length;
        shuffle(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println("I:"+ar[i]);
        }

        shuffle2(ar);
        for(int j=0;j<ar.length;j++){
            System.out.println("J:"+ar[j]);
        }

    }

    public static void shuffle(int ar[]) {
        Random r = new Random();
        for (int i = 0; i < ar.length; i++) {
            int index = r.nextInt(i + 1);
            int temp = ar[index];
            ar[index] = ar[i];
            ar[i] = temp;
        }

    }
        public static void shuffle2(int ar[]){

    Random r2 = new Random();
    for(int j=0;j<ar.length;j++){
        int ind = r2.nextInt(j+1);
        int t = ar[ind];
        ar[ind]=ar[j];
        ar[j]=t;
    }


    }

}
