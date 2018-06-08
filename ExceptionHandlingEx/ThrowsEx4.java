package com.expertzlab.ExceptionHandlingEx;

import java.io.*;
class ThrowsExa {
    void myMethod(int num) throws IOException{
        if(num==1)
            System.out.println("IOException...");
        else
            System.out.println("Class not found exception..");
    }
}

public class ThrowsEx4{
    public static void main(String args[]) throws Exception{

           ThrowsExa obj = new ThrowsExa();
           obj.myMethod(1);


        }
    }

