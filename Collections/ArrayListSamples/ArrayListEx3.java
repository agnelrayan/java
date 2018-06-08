package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;

/**
 * Created by geo on 13/10/17.
 */
public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<11;i++)
            numbers.add(i);

        int total=0;
        for(int i=0;i<numbers.size();i++)
            total+=numbers.get(i);
        System.out.println("The total is"+total);
        System.out.println("First Element:"+numbers.get(0));
        System.out.println("Last Element:"+numbers.get(numbers.size()-1));
    }
}
