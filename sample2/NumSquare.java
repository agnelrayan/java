package com.expertzlab.sample2;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by agnel on 5/9/18.
 */
public class NumSquare {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Square of: "+num+"="+pow(num,2));
        System.out.println(sqrt(2));
        System.out.println(PI);
    }

}

