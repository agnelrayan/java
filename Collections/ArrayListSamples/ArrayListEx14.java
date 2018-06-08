package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx14 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(10);
        al.add(30);
        al.add(20);
        al.add(null);
        al.add(20);
      //  al.add("AB");

        for(Object obj:al){
            System.out.println(obj);
        }

        int i=al.size();
        System.out.println("The size of Collection is:"+i);
    }
}
