package com.expertzlab.sample2.collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by agnel on 5/21/18.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList();
        names.add("Joy");
        names.add("Jose");
        names.add("Joe");
        names.add("Anto");
        names.add("Joy");
        names.add(null);
        names.add(null);
        names.add(0,"AB");
        names.addLast("Shiloh");
     //   names.add(10);

        System.out.println("Using Enhanced For Loop..");

        for(String li:names){
            System.out.println(li);
        }

        System.out.println("Using Iterator Interface");
        Iterator itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
