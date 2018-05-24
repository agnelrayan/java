package com.expertzlab.ExceptionHandlingEx;

import java.io.*;
class Exceptex8{
    public static void main(String[] args){
        try{
            FileWriter file = new FileWriter("ag2.txt");
            file.write("helo ");
            file.close();
        }
        catch(IOException e){
            System.out.println(e);

        }
        System.out.println("Allow me to continue");
    }
}