package com.expertzlab.Collections.ArrayListSamples;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListEx15 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("ABc");
        al.add("DE");
        al.add("CD");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = obj.nextLine();
        al.add(name);

        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        System.out.println("Enter the Id");
        int id = obj.nextInt();
        al2.add(id);
        al2.add(10);
        al2.add(20);
        System.out.println(al2);

        Random random = new Random(System.currentTimeMillis());
        int i =random.nextInt(5);
        System.out.println(i);

        al2.add(i);
        System.out.println(al2);



    }

}
