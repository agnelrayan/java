package com.expertzlab.javatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by agnel on 3/23/18.
 */
public class Demo6for {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number");
        int as = Integer.parseInt(br.readLine());

        System.out.println("Enter the x value");
        int x = Integer.parseInt(br.readLine());

        int y = 0;

      /*  for(int i=0; i<= as ;i++){

            for(int j=1; j <= i ; j++){
                System.out.print(y + "\t");
                y = y + x;
            }

            System.out.println("");
        }*/

        for (int i = 0; i <= as; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(y + "t");
                y = y + x;
            }
            System.out.println("");
        }
    }
}
