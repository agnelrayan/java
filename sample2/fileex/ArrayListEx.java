package com.expertzlab.sample2.fileex;

import java.util.ArrayList;

/**
 * Created by agnel on 5/16/18.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        for(int i=0;i<10;i++)
            al.add(i);

        for(int j=0;j<10;j++)
            System.out.printf("%d, ",al.get(j));
        System.out.println();

        System.out.println("Size of ArrayList:"+al.size());

        for(int i=0;i<20;i++)
            al.add(i); for(int j=0;j<10;j++)
            System.out.printf("%d, ",al.get(j));
        System.out.println();

        for(int k=0;k<20;k++)
            System.out.printf("%d, ",al.get(k));
        System.out.println();

        System.out.println("Size of ArrayList:"+al.size());


    }
}
