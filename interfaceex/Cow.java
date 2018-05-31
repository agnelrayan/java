package com.expertzlab.interfaceex;

/**
 * Created by agnel on 2/28/18.
 */
public class Cow implements Animal {
    public void walk(){
        System.out.println("IN Walk method...Cow");
    }

    public void sound(){
        System.out.println("In Sound--Cow..Amm...");
    }

    public void run(){
        System.out.println("In Run--cow...");
    }

    public void color(){
        System.out.println("In Color--cow...");
    }
}
