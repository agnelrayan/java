package com.expertzlab.sample2;

import java.util.Scanner;

/**
 * Created by agnel on 5/7/18.
 */
public class NameScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first Name");
        String firstname = in.next();
        System.out.println("Name:"+firstname);

    }
}
