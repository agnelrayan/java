package com.expertzlab.sample2.fileex;

/**
 * Created by agnel on 5/16/18.
 */
public class StringEx3 {
    public static void main(String[] args) {
        String name2 ="John";
        String name=new String("John");
        String uname=new String("John");

        Abc a1 = new Abc();
        Abc a2 = new Abc();

        if(name==uname)
        //if(name.equals(uname))
            System.out.println("Equal");
        else
        System.out.println("Not Equal");
    }
}

class Abc{
    int a=10;
}
