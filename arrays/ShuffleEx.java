package com.expertzlab.arrays;

import java.util.Random;



/**
 * Created by agnel on 2/28/18.
 */
public class ShuffleEx {
    static int i;
    static void shufflefn(int a[]) {
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int in = random.nextInt(i + 1);
            int aa = a[in];
            a[in] = a[i];
            a[i] = aa;

        }
    }
        static void shufflefn2(int a[]){

        Random random = new Random();
        for(int j=a.length-1;i>0;i--){
            int index=random.nextInt(i+1);

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;

        }

    }





    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        shufflefn(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");

        System.out.println("Shuffle Function2...");
        shufflefn2(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
    }
}
