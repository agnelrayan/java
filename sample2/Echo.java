package com.expertzlab.sample2;

import java.util.Scanner;

/**
 * Created by agnel on 5/8/18.
 */
public class Echo {
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Something:");
        line = sc.nextLine();
        System.out.println("You Said:"+line);
        System.out.println("Type Something else:");
        line=sc.nextLine();
        System.out.println("You also Said:"+line);
    }
}
