package com.expertzlab.filehandling;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        //InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the Name");
        String name = br.readLine();


        System.out.println("Enter the Student Id:");
        int id = Integer.parseInt(br.readLine());


        System.out.println("Id is:"+id);
        System.out.println("Name is:"+name);

    }
}
