package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;

/**
 * Created by geo on 13/10/17.
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        ArrayList<Double> numbers = new ArrayList();
        ArrayList<Integer> nums = new ArrayList();
        System.out.println("The number of item is:"+nums.size());
        names.add("AA");
        System.out.println("The number of item is:"+nums.size());
        for(int i=1;i<=10;i++)
            nums.add(i);
        System.out.println("The number of item is:"+nums.size());

    }
}
