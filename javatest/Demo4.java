package com.expertzlab.javatest;

/**
 * Created by agnel on 3/23/18.
 */
public class Demo4 {
    public static void main(String[] args) {
        int i, j;
        aa:
        for (i = 1; i <= 3; i++) {
            bb:
            for (j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
