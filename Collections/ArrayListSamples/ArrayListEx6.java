package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Agnel on 13/10/17
 * .
 */
public class ArrayListEx6 {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<=100;i++)
            numbers.add(random.nextInt(101));

        /*if(numbers.indexOf(100)>=0)
            System.out.println("!100 was found at position:"+numbers.indexOf(100));*/


/*        if(numbers.contains(100))
            System.out.println("!100 was found at position:"+numbers.indexOf(100));
        else
            System.out.println("100 was fount at position:");*/

        int min=0;
        for(int i=1;i<numbers.size();i++)
        if(numbers.get(i)<numbers.get(min))
            min=i;
        System.out.println("The minimum value in number is"+numbers.get(min));




    }
}
