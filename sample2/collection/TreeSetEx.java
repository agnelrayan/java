package com.expertzlab.sample2.collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by agnel on 5/21/18.
 */
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet();
        names.add("Ab");
        names.add("Xy");
        names.add("AJ");
        names.add("IJ");
        names.add("LM");
       // names.add(1);
       // names.add(null);

        System.out.println("Contains Method:"+names.contains("Abg"));
        System.out.println("Is it Empty:"+names.isEmpty());
        System.out.println("Size of the Collection:"+names.size());
        System.out.println("Tail Set:"+names.tailSet("IJ"));
        System.out.println("Head Set:"+names.headSet("Ab"));

        Iterator itr = names.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
