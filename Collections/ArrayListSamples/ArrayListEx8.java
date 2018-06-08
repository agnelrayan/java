package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Agnel on 15/10/17.
 */
public class ArrayListEx8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        int j=numbers.size();
        System.out.println("Size of ArrayList is:"+j);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        j = numbers.size();
        System.out.println("Size of ArrayList is:"+j);
        int total = 0;
        for(int i=0;i<numbers.size();i++) {
           total+=numbers.get(i);
        }

        int avg = total/numbers.size();
        System.out.println("Total:"+total);
        System.out.println("AVG:"+avg);

        //get index position
        int k=numbers.indexOf(20);
        System.out.println("Index of:"+k);

        //get index value
        int a =numbers.get(1);
        System.out.println(a);

        int lastIndex=numbers.lastIndexOf(20);
        System.out.println("LastIndexOf:"+lastIndex);

        //particular value is contais or not
        boolean containsVar=numbers.contains(20);
        System.out.println(containsVar);

        boolean emptyVar = numbers.isEmpty();
        System.out.println("Is it Empty:"+emptyVar);

        ArrayList<Integer> numbers2 = new ArrayList();
        numbers2.add(100);
        numbers2.add(200);
        numbers2.add(30);

        System.out.println("Numbers:"+numbers);
        System.out.println("Numbers2"+numbers2);
      //  numbers.addAll(numbers2);
        System.out.println("After Adding"+numbers);

//        int removeVar=numbers.remove(1);
  //      System.out.println("Removing:"+removeVar);
        System.out.println("After Removing"+numbers);

        numbers.add(150);
        numbers2.add(150);
        System.out.println("AFter adding Numbers:"+numbers);
        System.out.println("AFter adding Numbers2:"+numbers2);

        boolean removeAllVar=numbers.removeAll(numbers2);
        System.out.println("Numbers:"+numbers);
        System.out.println("Numbers2:"+numbers2);
        System.out.println("Remove All"+removeAllVar);
        System.out.println("AFter Remove All"+numbers);

        numbers.add(30);
        numbers2.add(30);
        System.out.println("Before Retain All"+numbers);
        System.out.println("Before Retain All Numbers2"+numbers2);
        boolean retainAllVar=numbers.retainAll(numbers);
        System.out.println(retainAllVar);
        System.out.println("After Retain All method"+retainAllVar);
        System.out.println("AFter Retain All:"+numbers);


      /*  numbers.clear();

        int numberClear = numbers.size();
        System.out.println("After clearing"+numberClear);*/

    }

}
