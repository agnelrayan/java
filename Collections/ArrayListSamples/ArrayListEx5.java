package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Agnel on 13/10/17.
 */
public class ArrayListEx5 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        //System.out.println(random);

        int number;
       // number = random.nextInt(101);
        //System.out.println(number);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            number=random.nextInt(101);
            numbers.add(number);
        }

        display(numbers);
    }
    static void display(ArrayList arr){
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i)+" ");
    }

}
