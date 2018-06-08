package com.expertzlab.ExceptionHandlingEx;

import java.io.*;

/**
 * Created by agnel on 3/28/18.
 */
public class ExceptThrows {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("a.txt", false);
            String str = "Welcome to Java";
            byte[] bytes = str.getBytes();

            out.write(bytes);

            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream in = new FileInputStream("b.txt");
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
