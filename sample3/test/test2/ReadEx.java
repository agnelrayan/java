package com.expertzlab.sample3.test.test2;

import java.util.Scanner;

/**
 * Created by agnel on 5/17/18.
 */
public class ReadEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String firstName = input.next();

        System.out.println("Enter the Second Name:");
        String secondName = input.next();

        System.out.println("First Name is:"+firstName+"Second Name is:"+secondName);
    }
}
