package com.expertzlab.sample2;

import java.util.Random;

/**
 * Created by agnel on 5/16/18.
 */
public class RandomEx {
    public static void main(String[] args) {
        Random rn =new Random(1000);

        for(int i=0;i<4;i++){
            int num = rn.nextInt(10);
            System.out.printf("%d ,",num);
        }

        System.out.println();

        for(int i=0;i<4;i++){
            int num = rn.nextInt(5);
            System.out.printf("%d ,",num);
        }

    }
}
