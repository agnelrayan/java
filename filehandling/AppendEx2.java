package com.expertzlab.filehandling;


import java.io.*;
public class AppendEx2{
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ag123.txt", true))); //the true will append the new data
            out.println("New line append here !!");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

