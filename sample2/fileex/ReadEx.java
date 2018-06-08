package com.expertzlab.sample2.fileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by agnel on 5/17/18.
 */
public class ReadEx {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter your name:");
            String name = br.readLine();

            System.out.println("Enter the Id:");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter the Marks:");
            float marks = Float.parseFloat(br.readLine());

            System.out.println("Welcome Mr."+name);
            System.out.println("Your Id is:"+id);
            System.out.println("Your Score is:"+marks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
