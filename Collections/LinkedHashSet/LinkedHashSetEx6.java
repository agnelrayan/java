package com.expertzlab.Collections.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx6 {
    public static void main(String[] args) {
        LinkedHashSet li = new LinkedHashSet();
        li.add(20);
        li.add(10);
        li.add(50);
        li.add(40);
        li.add(10);
        li.add("AB");

        Iterator itr = li.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
