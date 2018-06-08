package com.expertzlab.sample2.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.Stream;

/**
 * Created by agnel on 5/18/18.
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        List<String> al = new ArrayList();
        al.add("JOy");
        al.add("Jose");
        al.add("Anto");
        al.add("Dave");
        al.add("John");
     //   al.add(0,"AG");
        al.add(null);
        al.add(null);
        al.add("Anto");
      //  System.out.println("Get the Position:"+al.get(-1));
     //   al.remove(1);
       // al.add(10);
        //al.add(20);
        System.out.println(al.contains("AG"));
        System.out.println(al.isEmpty());

        System.out.println("Size of Array"+al.size());

        ArrayList<String> al2 = new ArrayList();
        al2.add("Babu");
        al2.add("Eliza");
        al2.add("John");



        //al2.removeAll(0);

        //al.addAll(al2);

       // al.retainAll(al2);

        System.out.println("Using Enhanced For Loop");
        for(String obj:al){
            System.out.println(obj);
            al.remove("John");
        }

        System.out.println("Iterate using Iterator");

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
