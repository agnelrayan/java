package com.expertzlab.Collections.HashSetSample;

import java.util.*;

public class ArrayToSet {
    public static void main(String[] args) {
        String[] vowels={"A","E","I","O","U"};
        Set vowelsset = new HashSet(Arrays.asList(vowels));
        //nameset.add(names);
        System.out.println(vowelsset);

        Collections.addAll(vowelsset,vowels);
        System.out.println(vowelsset);

        TreeSet treeSet = new TreeSet(vowelsset);
        System.out.println(treeSet);

        /*vowelsset.remove("E");
        System.out.println(vowelsset);*/

        /*
        vowelsset.clear();
        System.out.println(vowelsset);*/

    }

}

