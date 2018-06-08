package com.expertzlab.filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStreamBuffEx2 {
    public static void main(String[] args) throws Exception{

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String name="";
        while(!name.equals("stop")) {
            System.out.println("Enter the String");
            name = br.readLine();
            System.out.println("The given name is" + name);
                  }
        System.out.println("You have selected Stop");

     br.close();
        in.close();

    }
}
