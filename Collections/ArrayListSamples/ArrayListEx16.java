package com.expertzlab.Collections.ArrayListSamples;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx16 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("AG");
        al.add(89.34);
        System.out.println(al);

        System.out.println("Using for loop");
        for(int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("For each loop:");
        for(Object obj:al){
            System.out.println(obj);
        }

        System.out.println("Using Iterator");

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }


}
