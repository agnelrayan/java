package com.expertzlab.Collections.LinkedHashSet;

import java.util.LinkedHashSet;
public class LinkedHashSetEx3
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        linkedset.add("Abel");
        linkedset.add("Bala");
        linkedset.add("Calvin");
        linkedset.add("Don");

        //This will not add new element as A already exists
        linkedset.add("Abel");
        linkedset.add("Enoch");

        System.out.println("Size of LinkedHashSet = " +linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
        System.out.println("Removing D from LinkedHashSet: " +linkedset.remove("Don"));
        System.out.println("Trying to Remove Z which is not "+"present: " + linkedset.remove("Zara"));
        System.out.println("Checking if A is present=" +linkedset.contains("Abel"));
        System.out.println("Updated LinkedHashSet: " + linkedset);
    }
}
