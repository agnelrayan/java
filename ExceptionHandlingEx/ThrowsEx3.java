package com.expertzlab.ExceptionHandlingEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by geo on 5/10/17.
 */
public class ThrowsEx3 {
    public static void main(String[] args) throws IOException{
        try {
            FileReader fileReader = new FileReader("Ag.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for (int counter = 0; counter < 3; counter++) {
                System.out.println(bufferedReader.readLine());
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}