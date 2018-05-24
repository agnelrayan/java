package com.expertzlab.sample3;

/**
 * Created by agnel on 5/10/18.
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        int ar[] = {10,30,40,20,50};
        int max=ar[0];
        int i;
        for(i=1;i<ar.length;i++){
            if(max<ar[i]){
                max=ar[i];
            }
           // System.out.println("Max value:");
        }
        System.out.println("Max Value: "+max);
    }
}
