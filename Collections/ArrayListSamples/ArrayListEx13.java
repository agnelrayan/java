package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;

/**
 * Created by Agnel on 16/10/17.
 */
public class ArrayListEx13 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("abc");
        al.add("abd");
        al.add("bcd");
        al.add("cde");

        for(Object obj:al) {
            System.out.println(obj);
        }


        //add( Object o): This method adds an object o to the arraylist.

                al.add("hello");
        System.out.println("After adding helo:");
        for(Object obj:al) {
            System.out.println(obj);
        }

        //add(int index, Object o): It adds the object o to the array list at the given index.

                al.add(2, "bye");
        System.out.println("After setting index 2:");
        for(Object obj:al) {
            System.out.println(obj);
        }
        //remove(Object o): Removes the object o from the ArrayList.

        System.out.println("After Removing:");
                al.remove("abc");
        for(Object obj:al) {
            System.out.println(obj);
        }
        //remove(int index): Removes element from a given index.

        al.remove(3);
        System.out.println("Remove elements from Index 3:");
        for(Object obj:al) {
            System.out.println(obj);
        }
        //set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.

        al.set(2, "ag");
        System.out.println("Setting element to Index 2:");
        for(Object obj:al) {
            System.out.println(obj);
        }
        //int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.

        int pos = al.indexOf("ag");
        System.out.println("Position of:"+pos);

        //Object get(int index): It returns the object of list which is present at the specified index.

                String str= al.get(2);
        System.out.println("Get of: "+str);
        //int size(): It gives the size of the ArrayList – Number of elements of the list.

        int numberofitems = al.size();
        System.out.println("Number of Items:"+numberofitems);

       // boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.

         boolean result=al.contains("Steve");
        System.out.println("Contains:"+result);

        //clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.

        al.clear();
        int i=al.size();
        System.out.println("Size of collections:"+i);
    }
}
