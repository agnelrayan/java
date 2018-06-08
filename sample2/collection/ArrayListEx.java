package com.expertzlab.sample2.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by agnel on 5/17/1
 * r8.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList();
        System.out.println(list.size());

        list.add("AG");
        list.add("Anto");
        list.add("Joy");
        list.add("Peace");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        list.remove(1);

        for(String obj:list){
            System.out.println(obj);
        }

    }
}
