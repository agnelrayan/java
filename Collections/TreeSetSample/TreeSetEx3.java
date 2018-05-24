package com.expertzlab.Collections.TreeSetSample;

import java.util.*;

class TreeSetEx3
{
    public static void main (String[] args)
    {

        TreeSet ts5 = new TreeSet();

        // Uncommenting below  throws NoSuchElementException
        // System.out.println(ts5.first());

        // Uncommenting below throws NoSuchElementException
        // System.out.println(ts5.last());

        ts5.add("Ag");
        ts5.add("Cavin");
        ts5.add("Beno");
        ts5.add("Anto");
        ts5.add("Charles");
        ts5.add("KK");
        ts5.add("ZZ");

        System.out.println(ts5.first()); // Ag
        System.out.println(ts5.last()); //ZZ

        // Elements less than O. It prints
        // [Compiler,GeeksforGeeks]
        System.out.println(ts5.headSet("D"));

        // Elements greater than or equal to G.
        // It prints [GeeksforGeeks, Practice]
        System.out.println(ts5.tailSet("B"));

        // Elements ranging from C to P
        // It prints [Compiler,GeeksforGeeks]
        System.out.println(ts5.subSet("B","Y"));

        // Deletes all elements from ts5.
        ts5.clear();

        // Prints nothing
        System.out.println(ts5);
    }
}