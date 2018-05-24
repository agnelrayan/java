package com.expertzlab.sample2;

/**
 * Created by agnel on 5/6/18.
 */
public class Prime {
    public static void main(String[] args) {
        int n = 70;
        int flag = 0;
        int m=n/2;
        if (n == 0 || n == 1)
            System.out.println("Not Prime Numbers");

        else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime Numbers");
                    flag = 1;
                    break;
                }
            }


            if (flag == 0)
                System.out.println("Prime Numbers");
        }

        }
    }