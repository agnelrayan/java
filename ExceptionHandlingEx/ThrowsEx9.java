package com.expertzlab.ExceptionHandlingEx;

import java.io.*;
class file1{
    public static void main(String[] args)
    {
    try

    {
        FileWriter file = new FileWriter("ag3.txt");
        file.write("welcome to Exception");
        file.close();
    }
    catch(Exception e){
        System.out.println("Exception");
    }
        System.out.println("Allow me continue...");


    }}
