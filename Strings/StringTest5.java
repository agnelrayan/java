package com.expertzlab.Strings;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by agnel on 3/5/18.
 */
public class StringTest5 {
    public static void main(String[] args) {
        Random random = new Random();
       // Scanner obj = new Scanner(System.in);
        for(int i=0;i<=5;i++){
            int input = random.nextInt(100);
            System.out.println(input);
        }
        //System.out.println();
    }
}
