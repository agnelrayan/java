package com.expertzlab.arrays;


public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println(args instanceof Object);
        //int[] someIntegers = new int[] {42};
        int[] someIntegers ={10,20,30};
        System.out.println(someIntegers instanceof Object);

        int i =10;
        System.out.println((Object)i instanceof Object);
    }
}
