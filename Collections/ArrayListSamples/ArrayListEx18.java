package com.expertzlab.Collections.ArrayListSamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx18 {
    public static void main(String[] args) {


        ArrayList<String> word = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.nextLine();
        word.add(str);
        System.out.println("Before Reverse:"+word);
        Collections.reverse(word);
        System.out.println(word+":After Reverse");

        ArrayList<String> rword = new ArrayList();

        rword.add(str);


        if((word.equals(rword)))
            System.out.println("is palindrome:"+word);
        else
            System.out.println("Not Palindrome:"+word);


    }

}

