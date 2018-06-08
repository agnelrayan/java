package com.expertzlab.Collections.HashSetSample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEx6 {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
         System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<Integer>(listNumbers);
        System.out.println(uniqueNumbers);

        Set<String> names = new HashSet();
        names.add("Tom");
        names.add("Mary");

        if (names.add("Peter")) {
            System.out.println("Peter is added to the set");
        }

        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }
        names.add(null);

        System.out.println(names);

        if (names.remove("Mary")) {
            System.out.println("Marry is removed");
        }

        System.out.println(names);

        if (names.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }

        names.clear();

        if (names.isEmpty()) {
            System.out.println("The set is empty");
        }

        Set<String> name = new HashSet();
        name.add("Tom");
        name.add("Mary");
        name.add("Peter");
        name.add("Alice");
        if (name.contains("Mary")) {
            System.out.println("Found Mary");
        }
        System.out.println(name);
        System.out.printf("The set has %d elements", name.size());

       // Set<Integer> a = new HashSet<Integer>();
      //  a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> s1 = new HashSet(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet(Arrays.asList(8, 89));

        if (s1.containsAll(s2)) {
            System.out.println("set2 is a subset of s1");
        }

        System.out.println(s1);

        Set<Integer> set1 = new HashSet(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> set2 = new HashSet(Arrays.asList(2, 4, 6, 8));

        System.out.println("set1 before union: " + set1);

        set1.addAll(set2);

        System.out.println("set1 after union: " + set1);

        Set<Integer> set3 = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> set4 = new HashSet(Arrays.asList(2, 4, 6, 8));

        System.out.println("set3 before intersection: " + set3);

        set3.retainAll(set4);

        System.out.println("set4 after intersection: " + set4);

        Set<Integer> set5 = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
        Set<Integer> set6 = new HashSet(Arrays.asList(2, 4, 6, 8));

        System.out.println("set5 before difference: " + set5);

        set5.removeAll(set6);

        System.out.println("set6 after difference: " + set6);

    }
}
