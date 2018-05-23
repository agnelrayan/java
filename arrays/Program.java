package com.expertzlab.arrays;

public class Program {
    public static void main(String[] args) {

        // Add different objects to an Object array.
        Object[] elements = new Object[4];
        elements[0] = "cat";
        elements[1] = 100;
        elements[2] = new StringBuilder("abc");
        elements[3] = 1.2;

        // Print the objects in a for-loop.
        for (Object e : elements) {
            System.out.println(e);
        }
    }
}
