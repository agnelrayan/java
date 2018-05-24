package com.expertzlab.sample2.fileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by agnel on 5/1= 6/18.
 */
public class BuffRead {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String name="";
        while(!name.equals("stop")) {
            System.out.println("Enter the data:If you want to terminate, type stop");
            name = br.readLine();

            System.out.println("Enter the Id:");
            int id = Integer.parseInt(br.readLine());
            System.out.println("Welcome:" + name);
            System.out.println("Id:" + id);
        }

    }
}
