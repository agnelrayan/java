package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrayListEx17 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(null);
        al.add(10);
        al.add(30);
        al.add(null);
        //al.add("AB");
        //al.add("XY");
        // al.add(89.90);
        System.out.println(al);
        System.out.println("Iterating using for each loop:");
        for (Integer obj : al) {
            System.out.println(obj);
        }

        System.out.println("Iterator Interface:");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("AB");
        //al2.add(323);
        al2.add("XY");
        al2.add("ij");

        ArrayList<String> al3 = new ArrayList(100);
        al3.add("LM");
        al3.add("JK");

        System.out.println("Iterate the String elements:");

        for (String obj : al2) {
            System.out.println(obj);
        }
        al3.addAll(al2);

        System.out.println("addAll() method....");
        for (String obj2 : al3) {
            System.out.println(obj2);
        }

        System.out.println("Random Class...");
        Random random = new Random(System.currentTimeMillis());
        int number;
        number = random.nextInt(100);
        System.out.println(number);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            number = random.nextInt(100);
            numbers.add(number);

        }
        display(numbers);
        //System.out.println(numbers);

      /*  if(numbers.contains(90)){
            System.out.println("90 was found at position:"+numbers.indexOf(90));
        }
        else
            System.out.println("90 was not found in numbers");*/

        int min = 0;
        for (int i = 1; i < numbers.size(); i++)
            if (numbers.get(i) < numbers.get(min))
                min = i;
        System.out.println("The minimum value in numbers is:" + numbers.get(min));

        System.out.println("After Sorting...");
        Collections.sort(numbers);
        System.out.println(numbers);
    }


        static void display(ArrayList arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+" ");
        }



    }
}
