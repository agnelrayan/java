package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Agnel on 14/10/17.
 */
public class ArrayListEx7 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList();
        for(int i=0;i<=5;i++)
            numbers.add(random.nextInt(101));
        display(numbers);
        Collections.sort(numbers);
        display(numbers);
    }
    static void display(ArrayList arr){
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i)+" ");
        System.out.println("");
            }


}
